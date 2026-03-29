package vd1_lopsanpham;
import java.util.Scanner;
public class Lopsp {
 public String tenSP;
 public double donGia;
 public double giamGia;
 public double getThueNhapKhau() {
	 return donGia*0.1;
 }
 public void Nhap() {
	 Scanner c=new Scanner(System.in);
	 System.out.println("nhap ten san pham:");
	 tenSP=c.nextLine();
	 System.out.println("nhap don gia san pham:");
	 donGia=c.nextDouble();
	 System.out.println("nhap giam gia san pham:");
	 giamGia=c.nextDouble();
 }
 public void Xuat() {
	 System.out.println("ten san pham"+tenSP);
	 System.out.println("don gia san pham"+donGia);
	 System.out.println("ten giam gia san pham"+giamGia);
	 System.out.println("thue san pham"+getThueNhapKhau());
	 
 }
}
