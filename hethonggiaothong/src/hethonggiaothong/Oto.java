package hethonggiaothong;

public class Oto extends PhuongTien {
    private int soCho;
    private String kieuDongCo; 

    public Oto(String hang, int nam, double gia, int soCho, String dongCo) {
        super(hang, nam, gia);
        this.soCho = soCho;
        this.kieuDongCo = dongCo;
    }

    @Override
    public double layVanTocToiDa() {
        if (kieuDongCo.equalsIgnoreCase("điện")) return 150;
        return 180;
    }

    @Override
    public int laySoChoNgoi() {
        return soCho;
    }


    public double tinhThueTruocBa() {
        double thue = 0;

        if (kieuDongCo.equalsIgnoreCase("điện")) {
            thue = giaBan * 0.03; 
        } else {
            thue = giaBan * 0.10;
        }

        return thue;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số chỗ: " + soCho);
        System.out.println("Động cơ: " + kieuDongCo);
        System.out.println("Thuế trước bạ: " + tinhThueTruocBa());
    }
}


