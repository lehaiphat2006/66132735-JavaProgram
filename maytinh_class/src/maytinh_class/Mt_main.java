package maytinh_class;
import java.util.Scanner;
public class Mt_main {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		Mt_class mt=new Mt_class();
		System.out.print("nhap hang:");
		mt.hang=c.nextLine();
		System.out.print("nhap ram:");
		mt.ram=c.nextInt();
		System.out.print("nhap o cung:");
		mt.oCung=c.nextInt();
		System.out.print("nhap gia:");
		mt.gia=c.nextDouble();
		mt.kiemTraCauHinh();
		System.out.println("co the choi game:"+(mt.coTheChoiGame() ? "co":"khong"));
		System.out.print("tinh them thue:"+(mt.tinhThue()));
		

	}

}
