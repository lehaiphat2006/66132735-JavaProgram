package bt_array_kethop_class;

public class HocSinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	public HocSinh() {
		this.tenHS=" ";
		this.tuoiHS=0;
		this.lopHS=" ";
	}
	
	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		super();
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	
	@Override
	public String toString() {
		String chuoixuat;
		chuoixuat="\nten HS:"+tenHS;
		chuoixuat=chuoixuat+"\ntuoi HS:"+tuoiHS;
		chuoixuat=chuoixuat+"\nlop HS:"+ lopHS;
		return chuoixuat;
//		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}

	public String getTenHS() {
		return tenHS;
	}
	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}
	public short getTuoiHS() {
		return tuoiHS;
	}
	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}
	public String getLopHS() {
		return lopHS;
	}
	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}
	
}
