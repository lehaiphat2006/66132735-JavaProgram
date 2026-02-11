package sach_oop;
import java.util.Scanner;
public class sachmain_oop {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Sach_class s1=new Sach_class();
		System.out.print("nhap tieu de:");
		s1.tieude=scanner.nextLine();
		System.out.print("nhap ten tac gia:");
		s1.tacgia=scanner.nextLine();
		System.out.print("nhap gia tien:");
		s1.gia=scanner.nextDouble();
		System.out.print("nhap so trang:");
		s1.sotrang=scanner.nextInt();
		s1.hienthithongtin();
		System.out.print("=============\n");
		scanner.nextLine();
		
		Sach_class s2=new Sach_class();
		System.out.print("nhap tieu de:");
		s2.tieude=scanner.nextLine();
		System.out.print("nhap ten tac gia:");
		s2.tacgia=scanner.nextLine();
		System.out.print("nhap gia tien:");
		s2.gia=scanner.nextDouble();
		System.out.print("nhap so trang:");
		s2.sotrang=scanner.nextInt();
		s2.hienthithongtin();
		System.out.print("=============\n");
		scanner.nextLine();
		
		Sach_class s3=new Sach_class();
		System.out.print("nhap tieu de:");
		s3.tieude=scanner.nextLine();
		System.out.print("nhap ten tac gia:");
		s3.tacgia=scanner.nextLine();
		System.out.print("nhap gia tien:");
		s3.gia=scanner.nextDouble();
		System.out.print("nhap so trang:");
		s3.sotrang=scanner.nextInt();
		s3.hienthithongtin();
	}

}
