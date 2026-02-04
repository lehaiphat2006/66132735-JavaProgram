/**
 * 
 */
package tong2so;
import java.util.Scanner;
/**
 * 
 */
public class Tong_2_so {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        double s1 = scanner.nextDouble();        
        System.out.print("Nhập số thứ hai: ");
        double s2 = scanner.nextDouble();       
        double sum = s1 + s2;
        System.out.printf("Tổng của %.2f và %.2f là: %.2f",s1,s2,sum);
        
        scanner.close();
	}

}
