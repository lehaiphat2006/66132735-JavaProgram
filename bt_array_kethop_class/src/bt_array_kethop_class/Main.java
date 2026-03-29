package bt_array_kethop_class;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// tao moi 2hs ,hard-code
		HocSinh hs1=new HocSinh();
		String tenHS1="nguyen van a";
		hs1.setTenHS(tenHS1);
		short tuoiHS1=10;
		hs1.setTuoiHS(tuoiHS1);
		String lopHS1="8A";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2=new HocSinh("tran thi B",(short)12,"9C");
		//in ra man hinh
		
		System.out.println(hs1.toString());
//		System.out.print(hs2.toString());
		
		System.out.println("ten hs 2:"+hs2.getTenHS());
		System.out.println("tuoi hs 2:"+hs2.getTuoiHS());
		System.out.println("lop hs 2:"+hs2.getLopHS());
		//nhap du lieu tu ban phim
		Scanner c=new Scanner(System.in);
		HocSinh hs3=new HocSinh();
		System.out.println("============");
		System.out.println("ten hs 3:");
		String tenHS3=c.nextLine();
		hs3.setTenHS(tenHS3);
		System.out.println("tuoi hs 3:");
		short tuoiHS3=c.nextShort();
		hs3.setTuoiHS(tuoiHS3);
		c.nextLine();
		System.out.println("lop hs 3:");
		String lopHS3=c.nextLine();
		hs3.setLopHS(lopHS3);
		//in ra man hinh
		System.out.println(hs3.toString());
		
		//nhap danh sach n hoc sinh
		ArrayList<HocSinh> dshs=new ArrayList<HocSinh>();
		System.out.println("nhap n phan tu:");
		int n=c.nextInt();
		c.nextLine();
		for(int i=0;i<n;i++) {
			HocSinh hsi=new HocSinh();
			System.out.println("ten hs thu:"+(i+1));
			String tenHSi=c.nextLine();
			hsi.setTenHS(tenHSi);
			System.out.println("tuoi hs thu:"+(i+1));
			short tuoiHSi=c.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			c.nextLine();
			System.out.println("lop hs thu:"+(i+1));
			String lopHSi=c.nextLine();
			hsi.setLopHS(lopHSi);
			//dua vao dsach
			dshs.add(hsi);
		}
		
		//in ra
		for(int i=0;i<n;i++) {
			System.out.println(dshs.get(i).toString());
		}
		//nhap them
		HocSinh them=new HocSinh();
		System.out.println("ten hs them:");
		String tenHSthem=c.nextLine();
		them.setTenHS(tenHSthem);
		System.out.println("tuoi hs them:");
		short tuoiHSthem=c.nextShort();
		them.setTuoiHS(tuoiHSthem);
		c.nextLine();
		System.out.println("lop hs them:");
		String lopHSthem=c.nextLine();
		them.setLopHS(lopHSthem);
		//dua vao dsach
		dshs.add(them);
		//xuat 
		for(int i=0;i<dshs.size();i++) {
			System.out.println(dshs.get(i).toString());
			
		}
		System.out.println("=========");
		//xoa hoc sinh ten "Hoa" dau tien trong danh sach
		for(int i=0;i<dshs.size();i++) {
			HocSinh hs=dshs.get(i);
			if(hs.getTenHS()=="Hoa") {
				dshs.remove(hs);
				break;
			}
		}
		//in ra
		for(int i=0;i<dshs.size();i++) {
			System.out.println(dshs.get(i).toString());
		}
	}

}
