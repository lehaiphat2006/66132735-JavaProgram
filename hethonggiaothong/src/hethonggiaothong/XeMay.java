package hethonggiaothong;

	public class XeMay extends PhuongTien {
	    private int dungTichXiLanh;
	    private String loaiXe; 

	    public XeMay(String hang, int nam, double gia, int dungTich, String loai) {
	        super(hang, nam, gia);
	        this.dungTichXiLanh = dungTich;
	        this.loaiXe = loai;
	    }

	    @Override
	    public double layVanTocToiDa() {
	        if (dungTichXiLanh < 100) return 80;
	        else if (dungTichXiLanh <= 150) return 100;
	        else return 120;
	    }

	    @Override
	    public int laySoChoNgoi() {
	        return 2;
	    }

	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Dung tích: " + dungTichXiLanh + "cc");
	        System.out.println("Loại xe: " + loaiXe);
	    }
	}

