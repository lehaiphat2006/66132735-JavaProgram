package thigk2.lehaiphat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class docfile {
	// Đọc file -> mỗi dòng 1 số thực -> lưu vào ArrayList
	// In danh sách số ra màn hình
	// Nhập giá trị X (ngày sinh)
	// Duyệt danh sách kiểm tra X có tồn tại không
	// In kết quả (có / không)
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Double> ds =new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		//đọc file (mỗi dòng 1 số)
		 BufferedReader br = new BufferedReader(new FileReader("vanbanso.txt"));
	        String line;

	        while ((line = br.readLine()) != null) {
	        	line = line.trim(); // xóa khoảng trắng

	            if (!line.isEmpty()) { // bỏ qua dòng rỗng
	            	 System.out.println("Dang doc: " + line);
	                ds.add(Double.parseDouble(line));}
	        }
	        br.close();
	        
	        //in danh sách
	        System.out.println("danh sach so:");
	        for(double x:ds) {
	        	System.out.println(x);
	        }
	        //nhập x(ngày sinh)
	        System.out.print("\nNhap X (ngay sinh): ");
	        double X = sc.nextDouble();
	        //kiểm tra x có trong danh sách không
	        boolean found = false;
	        for (double x : ds) {
	            if (x == X) {
	                found = true;
	                break;
	            }
	        }
	        //kết quả
	        if(found) {
	        	System.out.println("X có trong danh sách");
	        }else {
	        	System.out.println("X không có trong dánh sách");
	        	
	        }
	}
	}
}
