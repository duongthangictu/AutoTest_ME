package btvn_day5;

public abstract class HinhHoc {
	private String tenHinh;
	
	public String getTenHinh() {
		return tenHinh;
	}
	public void setTenHinh(String newTenHinh) {
		this.tenHinh = newTenHinh;
	}
	
	public abstract void tinhDienTich();
}
