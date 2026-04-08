package vidu_interface;

//Interface 1: Có thể bay
interface CoTheBay {
 // Hằng số
 int SO_CANH = 2;
 
 // Phương thức trừu tượng
 void bay();
 
 // Phương thức mặc định (Java 8+)
 default void haCanh() {
     System.out.println("Đang hạ cánh...");
 }
 
 // Phương thức static (Java 8+)
 static void thongTinVeBay() {
     System.out.println("Bay là di chuyển trong không trung");
 }
}

//Interface 2: Có thể bơi
interface CoTheBoi {
 void boi();
 
 default void lapLai() {
     System.out.println("Lặp lại động tác bơi...");
 }
}

//Interface 3: Có thể chạy
interface CoTheChay {
 void chay();
 
 // Overloading trong interface
 void chay(double tocDo);
 
 default void nghiNgoi() {
     System.out.println("Nghỉ ngơi sau khi chạy");
 }
}
abstract  class DongVat {
	protected String ten;
    protected int tuoi;
    
    public DongVat(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    // Phương thức trừu tượng
    public abstract void an();
    
    // Phương thức thông thường
    public void ngu() {
        System.out.println(ten + " đang ngủ...");
    }
    
    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
    }
}
