/**
 * 
 */
package thuchanh2;
import java.util.Scanner;
/**
 * 
 */
public class thuchanh2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vnd;
		double usd=23.500,eur=27.000;
		Scanner c=new Scanner(System.in);
		System.out.println("nhập số tiền:");
		vnd=c.nextDouble();
		System.out.printf("quy đổi USD sang VND=%.3f đ\n",vnd*usd);
		System.out.printf("quy đổi EUR sang VND=%.3f đ\n",vnd*eur);
	}

}
