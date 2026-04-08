package vidu_interface;

public class Main {

	public static void main(String[] args) {
		     
        System.out.println("\n=== ĐỘNG VẬT VÀ INTERFACE ===");
        
        // Chim cánh cụt
        ChimCanhCut chim = new ChimCanhCut("Pingu", 2);
        chim.hienThiThongTin();
        chim.an();
        chim.boi();
        chim.lapLai();  // Phương thức đã override
        
        System.out.println("\n---\n");
        
        // Vịt - implement nhiều interface
        Vit vit = new Vit("Donald", 3);
        vit.hienThiThongTin();
        vit.hienThiTatCaKhNang();
        
        System.out.println("\n---\n");
        
        // Máy bay - chỉ implement interface
        MayBay mayBay = new MayBay("Boeing 747", "Boeing");
        mayBay.hienThiThongTin();
        mayBay.bay();
        mayBay.haCanh();
        
        // Gọi phương thức static từ interface
        CoTheBay.thongTinVeBay();
        
        System.out.println("\n=== SỬ DỤNG ĐA HÌNH VỚI INTERFACE ===");
        
        // Mảng chứa các đối tượng có thể bay
        CoTheBay[] nhungThuCoTheBay = new CoTheBay[3];
        nhungThuCoTheBay[0] = vit;      // Vịt
        nhungThuCoTheBay[1] = mayBay;   // Máy bay
        // nhungThuCoTheBay[2] = chim;  // Lỗi! Chim cánh cụt không implement CoTheBay
        
        System.out.println("\nNhững thứ có thể bay:");
        for (CoTheBay bay : nhungThuCoTheBay) {
            if (bay != null) {
                bay.bay();
            }
        }
	}
}
	


