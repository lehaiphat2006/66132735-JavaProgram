/**
 * 
 */
package thuchanh1;
import java.util.Scanner;
/**
 * 
 */
public class thuchanh1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gio;
		double luong,tongluong;
		Scanner c=new Scanner(System.in);
		System.out.println("nhập số giờ:");
		gio=c.nextInt();
		System.out.println("nhập số lương:");
		luong=c.nextDouble();
		if(gio<=40) {
			 tongluong=luong*gio;
		}else{
			int giovuot=gio-40;
			 tongluong=luong*40+giovuot*luong*1.5;
		}
		System.out.printf("tổng lương nhận được sau %d giờ:%.1f\n",gio, tongluong);
		}

}	
	


