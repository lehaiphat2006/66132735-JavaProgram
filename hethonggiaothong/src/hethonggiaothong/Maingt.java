package hethonggiaothong;

public class Maingt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        XeMay xm = new XeMay("Honda", 2022, 300000, 110, "tay ga");
		        Oto oto = new Oto("Toyota", 2023, 800000, 5, "xăng");

		        System.out.println("=== Xe máy ===");
		        xm.hienThiThongTin();

		        System.out.println("\n=== Ô tô ===");
		        oto.hienThiThongTin();
		    }
	}

