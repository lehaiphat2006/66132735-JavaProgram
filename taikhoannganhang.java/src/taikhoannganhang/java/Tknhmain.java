package taikhoannganhang.java;

public class Tknhmain {

	public static void main(String[] args) {
		        Tknhclass tk1 = new Tknhclass("001");
		        System.out.println("TK1: " + tk1.getSoTaiKhoan() + " - " + tk1.getTenChuTaiKhoan() + " - So du: " + tk1.getSoDu());
		        Tknhclass tk2 = new Tknhclass("002", "hai phat");
		        System.out.println("TK2: " + tk2.getSoTaiKhoan() + " - " + tk2.getTenChuTaiKhoan() + " - So du: " + tk2.getSoDu());
		        Tknhclass tk3 = new Tknhclass("003", "Nguyen Van A", 5000);
		        System.out.println("TK3: " + tk3.getSoTaiKhoan() + " - " + tk3.getTenChuTaiKhoan() + " - So du: " + tk3.getSoDu());

		        System.out.println("-----------");
		        tk3.guiTien(2000);
		        tk3.rutTien(1000);
		        System.out.println("So du cuoi cua TK3: " + tk3.getSoDu());
		 }
	}

