package hethonggiaothong;

public class PhuongTien {
	    protected String hangSanXuat;
	    protected int namSanXuat;
	    protected double giaBan;

	    public PhuongTien() {}

	    public PhuongTien(String hang, int nam, double gia) {
	        this.hangSanXuat = hang;
	        this.namSanXuat = nam;
	        this.giaBan = gia;
	    }

	    public double layVanTocToiDa() {
	        return 0;
	    }

	    public int laySoChoNgoi() {
	        return 0;
	    }

	    public void hienThiThongTin() {
	        System.out.println("Hãng: " + hangSanXuat);
	        System.out.println("Năm SX: " + namSanXuat);
	        System.out.println("Giá bán: " + giaBan);
	        System.out.println("Vận tốc tối đa: " + layVanTocToiDa());
	        System.out.println("Số chỗ ngồi: " + laySoChoNgoi());
	    }
	}

