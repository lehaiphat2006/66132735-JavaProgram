package hinhchunhat_class;
import java.util.Scanner;
public class hcn_main {

	public static void main(String[] args) {
		Scanner c =new Scanner(System.in);
		Hcn_class h1 =new Hcn_class();
		System.out.print("nhap chieu dai:");
		h1.chieuDai=c.nextDouble();
		System.out.print("nhap chieu rong:");
		h1.chieuRong=c.nextDouble();
		h1.hienThiThongTin();

	}

}
