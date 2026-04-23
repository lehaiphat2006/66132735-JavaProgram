package thigk2.lehaiphat;
import java.util.Scanner;
import java.util.ArrayList;
//Tạo class SanPham (thuộc tính + constructor + getter/setter)
//Tạo danh sách ArrayList chứa sản phẩm
//Hard-code 3 sản phẩm ban đầu
//In danh sách sản phẩm
//Nhập thêm 1 sản phẩm từ bàn phím -> thêm vào danh sách
//In lại danh sách sau khi thêm
//Lọc và in các sản phẩm có loại = "thuc pham chuc nang"
public class SanPham {
	private String masp;
	private String tensp;
	private String loaisp;
	private double gia;//thuộc tính thêm
	//getter/setter
	public String getMasp() {
		return masp;
	}

	public void setMasp(String masp) {
		this.masp = masp;
	}

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public String getLoaisp() {
		return loaisp;
	}

	public void setLoaisp(String loaisp) {
		this.loaisp = loaisp;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}
	//constructor
	public SanPham(String masp, String tensp, String loaisp, double gia) {
	this.masp=masp;
	this.tensp=tensp;
	this.loaisp=loaisp;
	this.gia=gia;
	}
	//xuất
	public void Xuat() {
		System.out.println("mã sp:"+masp);
		System.out.println("tên sp:"+tensp);
		System.out.println("loại sp:"+loaisp);
		System.out.println("giá sp:"+gia);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> ds=new ArrayList<>();
		Scanner nc=new Scanner(System.in);
		//hard code 3 sản phẩm
		ds.add(new SanPham("SP01","Sua","Thuc pham",20000));
		ds.add(new SanPham("SP02","Thuoc da day","Thuc pham chuc nang",50000));
		ds.add(new SanPham("SP03","Coca-Cola","Do uong",15000));
		//in danh sach ban dau
		System.out.println("danh sach ban dau:");
		for(SanPham sp:ds) {
			sp.Xuat();
		}
		//thêm 1 sản phẩm
		System.out.println("Nhập sản phẩm mới:");
		
	}

}
