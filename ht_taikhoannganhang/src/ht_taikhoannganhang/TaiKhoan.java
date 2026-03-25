package ht_taikhoannganhang;

public class TaiKhoan {
	    protected String soTaiKhoan;
	    protected String tenChuTaiKhoan;
	    protected double soDu;

	    public TaiKhoan() {}

	    public TaiKhoan(String soTK, String ten, double soDu) {
	        this.soTaiKhoan = soTK;
	        this.tenChuTaiKhoan = ten;
	        this.soDu = soDu;
	    }

	    public void guiTien(double soTien) {
	        if (soTien > 0) {
	            soDu += soTien;
	        }
	    }

	    public void rutTien(double soTien) {
	        if (soTien > 0 && soTien <= soDu) {
	            soDu -= soTien;
	        } else {
	            System.out.println("Không đủ tiền!");
	        }
	    }

	    public void hienThiThongTin() {
	        System.out.println("Số TK: " + soTaiKhoan);
	        System.out.println("Chủ TK: " + tenChuTaiKhoan);
	        System.out.println("Số dư: " + soDu);
	    }
	}

