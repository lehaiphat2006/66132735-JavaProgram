package taikhoannganhang;
import java.util.Scanner;
public class Maintknh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		Tknh_class tk1=new Tknh_class();
		Tknh_class tk2=new Tknh_class();
		System.out.println("nhap so tai khoan:");
		tk1.soTaiKhoan=c.nextLine();
		System.out.println("nhap ten tai khoan:");
		tk1.tenChuTaiKhoan=c.nextLine();
		System.out.println("nhap so du:");
		tk1.soDu=c.nextDouble();
		
	
		System.out.print("nhap so tien de gui tien:");
		double sotien=c.nextDouble();
		tk1.guitien(sotien);
		tk1.hienthisodu();
		
		System.out.print("nhap so tien de rut tien:");
		double ruttien=c.nextDouble();
		if(tk1.ruttien(ruttien)) {
			System.out.println("rut tien thanh cong");
			tk1.hienthisodu();
		}else {
			System.out.println("rut tien khong thanh cong");
			tk1.hienthisodu();
		}
		
		
		System.out.print("nhap so tien de chuyen:");
		double ctien=c.nextDouble();
		System.out.println("chuyen tien sang tai khoan khac:");
		tk1.chuyentien(tk2,ctien);
		
		System.out.println("so du tai khoan dau:");
		tk1.hienthisodu();
		System.out.println("so du tai khoan khac:");
		tk2.hienthisodu();
	}

}
