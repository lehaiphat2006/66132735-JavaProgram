package vd1_lop_oop;
import java.util.Scanner;

public class Vd1_lopmain_oop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vd1_lop_oop vd=new Vd1_lop_oop(); 
		System.out.print("nhap ten:");
		vd.ten=sc.nextLine();
		vd.hocbai("java");
		System.out.print("\n tao them doi tuong:\n");
		//doi tuong 1
		Vd1_lop_oop vd1=new Vd1_lop_oop(); 
		System.out.print("nhap ten:");
		vd1.ten=sc.nextLine();
		System.out.print("nhap tuoi:");
		vd1.tuoi=sc.nextInt();
		sc.nextLine();
		System.out.print("nhap masv:");
		vd1.masv=sc.nextLine();
		System.out.printf("%s nam nay %d co ma sinh vien la %s\n",vd1.ten,vd1.tuoi,vd1.masv);
		//doi tuong 2
		Vd1_lop_oop vd2=new Vd1_lop_oop(); 
		System.out.print("nhap ten:");
		vd2.ten=sc.nextLine();
		System.out.print("nhap tuoi:");
		vd2.tuoi=sc.nextInt();
		sc.nextLine();
		System.out.print("nhap masv:");
		vd2.masv=sc.nextLine();
		System.out.printf("%s nam nay %d co ma sinh vien la %s",vd2.ten,vd2.tuoi,vd2.masv);
		
		
	}

}
