/**
 * 
 */
package tinhtoan;
import java.util.Scanner;
/**
 * 
 */
public class tinhtoan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập a:");
		a=sc.nextInt();
		System.out.println("nhập b:");
		b=sc.nextInt();
			System.out.printf("phép cộng:%d\n",a+b);
			System.out.printf("phép trừ:%d\n",a-b);
			System.out.printf("phép nhân:%d\n",a*b);
			System.out.printf("phép chia(/):%f\n",(float)a/b);
			System.out.printf("phép chia(%%):%d",a%b);
	}

}
