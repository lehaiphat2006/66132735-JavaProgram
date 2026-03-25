package ht_taikhoannganhang;

	public class TaiKhoanThanhToan extends TaiKhoan {
	    private double hanMucRut;
	    private double phiGiaoDich;

	    public TaiKhoanThanhToan(String soTK, String ten, double soDu, double hanMucRut, double phi) {
	        super(soTK, ten, soDu);
	        this.hanMucRut = hanMucRut;
	        this.phiGiaoDich = phi;
	    }

	    @Override
	    public void rutTien(double soTien) {
	        double tong = soTien + phiGiaoDich;

	        if (soTien > hanMucRut) {
	            System.out.println("Vượt hạn mức rút!");
	        } else if (tong <= soDu) {
	            soDu -= tong;
	        } else {
	            System.out.println("Không đủ tiền!");
	        }
	    }

	
	    public void thanhToanHoaDon(double soTien) {
	        double tong = soTien + phiGiaoDich;

	        if (tong <= soDu) {
	            soDu -= tong;
	            System.out.println("Thanh toán thành công!");
	        } else {
	            System.out.println("Không đủ tiền để thanh toán!");
	        }
	    }

	    @Override
	    public void hienThiThongTin() {
	        super.hienThiThongTin();
	        System.out.println("Hạn mức rút: " + hanMucRut);
	        System.out.println("Phí giao dịch: " + phiGiaoDich);
	    }
	}

