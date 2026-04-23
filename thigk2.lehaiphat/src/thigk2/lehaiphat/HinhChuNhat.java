package thigk2.lehaiphat;
import java.util.Scanner;
public class HinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		//nhập tọa độ
		System.out.print("Nhập x1(tren-trai):");
		double x1 =nc.nextDouble();
		System.out.print("Nhập y1(tren-trai):");
		double y1=nc.nextDouble();
		System.out.print("Nhập x2(duoi-phai):");
		double x2=nc.nextDouble();
		System.out.print("nhập y2(duoi-phai):");
		double y2=nc.nextDouble();
		
		//tính chiều dài và rộng
		double dai=Math.abs(x2-x1);
		double rong=Math.abs(y1-y2);
		
		//tính chu vi và diện tích
		double chuvi=2*(dai+rong);
		double dientich=dai*rong;
		
		//xuất kết quả
		System.out.println("chiều dài:"+dai);
		System.out.println("chiều rộng"+rong);
		System.out.println("Chu vi:"+chuvi);
		System.out.println("Diện tích"+dientich);
	}

}
