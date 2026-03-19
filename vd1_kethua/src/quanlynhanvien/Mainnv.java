package quanlynhanvien;

public class Mainnv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhanvien nv1=new Nhanvien("1","pphat",2345);
		System.out.print(nv1.toString());
		//nv1.hienThiThongTin();
		
		Nhanvienvp nv2=new Nhanvienvp("002", "Trần Thị Tươi Thắm", 2300000, 3, 200000);
		System.out.print(nv2.toString());
		//nv2.hienThiThongTin();
	}

}
