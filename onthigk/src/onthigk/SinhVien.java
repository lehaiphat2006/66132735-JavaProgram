package onthigk;
import java.util.Scanner;
public class SinhVien {
	private int stt;
	private String hoten;
	private int namsinh;
	private String gioitinh;
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public double getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public SinhVien() {
		this.stt=1;
		this.hoten=" ";
		this.gioitinh=" ";
		this.namsinh=0;

}
	public SinhVien(int stt, String hoten, int namsinh, String gioitinh) {
        this.stt = stt;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
}
	public void xuat() {
        System.out.println(stt + "  " + hoten + "  " + namsinh + "  " + gioitinh);
    }
}