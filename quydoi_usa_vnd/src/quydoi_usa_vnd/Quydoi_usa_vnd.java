package quydoi_usa_vnd;
	import java.util.Scanner;
public class Quydoi_usa_vnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		double vnd=25000;
		double tien;
		System.out.println("nhập số tiền cần đổi:");
		double usa=c.nextDouble();
		System.out.printf("số tiền quy đổi sang vnd là:%.1f",(usa*vnd));

	}

}
