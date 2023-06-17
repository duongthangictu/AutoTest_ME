package ver2;

public class HinhTron_ver2 extends HinhHoc_ver2 {
	public int banKinh;

	@Override
	public void tinhDienTich() {
		System.out.println("Dien tich Hinh Tron: " + (2 * 3.14 * banKinh));
	}

}
