package conmeo;
import java.util.Scanner;
public class main_conmeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner c=new Scanner(System.in);
			Conmeo m=new Conmeo();
			System.out.println("nhap ten con meo:");
			m.ten=c.nextLine();
			System.out.println("nhap mau long con meo:");
			m.maulong=c.nextLine();
			System.out.println("nhap tuoi con meo:");
			m.tuoi=c.nextInt();
			System.out.println("nhap can nang con meo:");
			m.cannang=c.nextDouble();
			System.out.print("tieng keu:");
			m.keu();
			m.an("an com");
			m.ngu();
			
			
	}

}
