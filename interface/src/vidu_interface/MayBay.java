package vidu_interface;

public class MayBay implements CoTheBay {
	private String ten;
    private String hangSanXuat;
    
    public MayBay(String ten, String hangSanXuat) {
        this.ten = ten;
        this.hangSanXuat = hangSanXuat;
    }
    
    @Override
    public void bay() {
        System.out.println(ten + " đang bay trên bầu trời!");
    }
    
    // Có thể override phương thức mặc định
    @Override
    public void haCanh() {
        System.out.println(ten + " đang hạ cánh tại sân bay...");
    }
    
    public void hienThiThongTin() {
        System.out.println("Tên máy bay: " + ten);
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Số cánh: " + CoTheBay.SO_CANH);  // Truy cập hằng số
    }
}
