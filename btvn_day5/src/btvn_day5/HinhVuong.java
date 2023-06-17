package btvn_day5;

public class HinhVuong extends HinhHoc {
	public int chieuDaiMotCanh;
	
	@Override
	public void tinhDienTich() {
		System.out.println("Dich tich hinh vuong: " + (chieuDaiMotCanh * 4));
	}

}
