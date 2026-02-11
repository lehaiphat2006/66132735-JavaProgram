package maytinh_class;

public class Mt_class {
	String hang;
    int ram;     
    int oCung;    
    double gia;
    
    public void kiemTraCauHinh() {
        System.out.println("Hãng: " + hang);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Ổ cứng: " + oCung + " GB");
        System.out.println("Giá: " + gia + " VND");
    }
    
    boolean coTheChoiGame() {
        return ram >= 8;
    }
    
    double tinhThue() {
        return gia * 0.10;
    }
    
    
}
