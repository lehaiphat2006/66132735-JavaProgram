package ht_taikhoannganhang;

public class Main {

		    public static void main(String[] args) {

		        TaiKhoanTietKiem tk1 = new TaiKhoanTietKiem("001", "Phát", 100000, 6, 6.5);
		        TaiKhoanThanhToan tk2 = new TaiKhoanThanhToan("002", "Phát", 500000, 2000000, 5000);

		        System.out.println("=== Tài khoản tiết kiệm ===");
		        tk1.hienThiThongTin();
		        tk1.rutTien(1000000);

		        System.out.println("\n=== Tài khoản thanh toán ===");
		        tk2.hienThiThongTin();
		        tk2.rutTien(1000000);
		        tk2.thanhToanHoaDon(2000000);

		        System.out.println("Số dư sau giao dịch: " + tk2.soDu);
		    }
	}


