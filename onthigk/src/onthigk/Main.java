package onthigk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) throws Exception {

	        ArrayList<SinhVien> ds = new ArrayList<>();

	        // ================= ĐỌC FILE =================
	        FileReader fr =new FileReader("qlsv.csv");
	        BufferedReader br = new BufferedReader(fr);
	        String line;

	        br.readLine(); // bỏ dòng tiêu đề

	        while ((line = br.readLine()) != null) {
	            String[] arr = line.split(";");

	            int stt = Integer.parseInt(arr[0].trim());
	            String hoten = arr[1].trim();
	            int namsinh = Integer.parseInt(arr[2].trim());
	            String gioitinh = arr[3].trim();

	            SinhVien sv = new SinhVien(stt, hoten, namsinh, gioitinh);
	            ds.add(sv);
	        }

	        br.close();

	        // ================= XUẤT DANH SÁCH =================
	        System.out.println("Danh sach sinh vien:");
	        for (int i = 0; i < ds.size(); i++) {
	            ds.get(i).xuat();
	        }
	       

	        // ================= ĐẾM =================
	        System.out.println("So luong SV: " + ds.size());

	        // ================= SV 2006 =================
	        System.out.println("SV sinh nam 2006:");
	        for (int i = 0; i < ds.size(); i++) {
	            if (ds.get(i).getNamsinh() == 2006) {
	                ds.get(i).xuat();
	            }
	        }

	        // ================= SV NỮ =================
	        System.out.println("SV nu:");
	        for (int i = 0; i < ds.size(); i++) {
	            if (ds.get(i).getGioitinh().equalsIgnoreCase("Nữ")) {
	                ds.get(i).xuat();
	            }
	        }

	        // ================= SẮP XẾP THEO TÊN =================
	        for (int i = 0; i < ds.size() - 1; i++) {
	            for (int j = i + 1; j < ds.size(); j++) {

	                String ten1 = ds.get(i).getHoten();
	                String ten2 = ds.get(j).getHoten();

	                if (ten1.compareToIgnoreCase(ten2) > 0) {
	                    SinhVien temp = ds.get(i);
	                    ds.set(i, ds.get(j));
	                    ds.set(j, temp);
	                }
	            }
	        }

	        System.out.println("Sau khi sap xep:");
	        for (int i = 0; i < ds.size(); i++) {
	            ds.get(i).xuat();
	        }

	        // ================= GHI FILE =================
	        FileWriter fw = new FileWriter("output.csv");

	        fw.write("STT;HoTen;NamSinh;GioiTinh\n");

	        for (int i = 0; i < ds.size(); i++) {
	            SinhVien sv = ds.get(i);

	            fw.write(
	                sv.getStt() + ";" +
	                sv.getHoten() + ";" +
	                sv.getNamsinh() + ";" +
	                sv.getGioitinh() + "\n"
	            );
	        }

	        fw.close();
	        System.out.println("Da ghi file output.csv");
	    }
	}

