package btvn_day5;

public class HinhTron extends HinhHoc {
	public int banKinh;

	@Override
	public void tinhDienTich() {
		System.out.println("Dien tich hinh tron: " + (2*3.14 * banKinh));
	}
}
