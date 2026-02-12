package taikhoannganhang;

public class Tknh_class {
	String soTaiKhoan;
    String tenChuTaiKhoan;
    double soDu;
    
    void guitien(double sotien) {
    	if(sotien>0 ) {
    		soDu+=sotien;
    		System.out.println("da gui tien thanh cong.");
    	}else {
    		System.out.println("gui tien khong thanh cong.");
    	}
    }
    boolean ruttien(double sotien) {
    	if(sotien>0 && sotien<=soDu) {
    		soDu-=sotien;
    		return true;}
    	return false;
    }
    
 
    
    void chuyentien(Tknh_class tkk_class, double sotien) {
    	if(sotien>0 && sotien<=soDu) {
    		soDu-=sotien;
    		tkk_class.soDu+=sotien;
    		System.out.println("chuyen tien thanh cong.");
    	}else {
    		System.out.println("chuyen tien khong thanh cong.");
    	}
    }
    
    void hienthisodu() {
    	System.out.println("so du hien tai la:"+soDu);
    }
    
}
