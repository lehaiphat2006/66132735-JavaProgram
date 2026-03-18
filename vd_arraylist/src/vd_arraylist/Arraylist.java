package vd_arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {

	public static void main(String[] args) {
		//khai bao bien danh sach ,chua so nguyen
		ArrayList<Integer> dsSoNguyen=new ArrayList<Integer>();
		//nhap 10 phan tu tu ban phim
		Scanner bp=new Scanner(System.in);
		for(int i=0;i<10;i++) {
		//nhap 1 phan tu
		//in ra 1 huong dan cho nguoi dung
		System.out.printf("moi nhap phan tu thu %d:", i+1);
		//System.out.print("a["+i+"]=");
		//cho user nhap,cat vao bien tam
		Integer tam=bp.nextInt();
		//them vao cuoi ds
		dsSoNguyen.add(tam);
		}
		//in ra ds vua nhap
		System.out.println("danh sach vua nhap:");
		for(int i=0;i< dsSoNguyen.size();i++) {
			//lay gia tri o phan tu vi tri i, cat vao bien tam
			Integer tam=dsSoNguyen.get(i);
			System.out.print(tam+" ");
		}
		System.out.print("\n");
		//cach 2 in ra ds vua nhap
		/*for(Integer x:dsSoNguyen) {
			System.out.print(x+" ");
		}*/
		//dem so phan tu chan
		int ptchan=0;
		for(Integer x:dsSoNguyen) {
			if(x%2==0)
				ptchan++;
		}
		System.out.print("so phan tu chan la:"+ptchan);
		//c2
		/*for(int i=0;i<dsSoNguyen.size();i++) {
			Integer tam=dsSoNguyen.get(i);
			if(tam%2==0)
				ptchan++;
		}*/
		//tinh tong cac phan tu trong ds:thuat toan cong don
		int tongall=0;
		for(Integer x:dsSoNguyen) {
			tongall+=x;
		}
		System.out.print("tong cac phan tu trong ds:"+tongall);

	}

}
