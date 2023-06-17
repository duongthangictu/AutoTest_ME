package ver2;

public class HinhVuong_ver2 extends HinhHoc_ver2 {
	public int chieuDaiMotCanh;

	@Override
	public void tinhDienTich() {
		System.out.println("Dien tich Hinh Vuong: " + (chieuDaiMotCanh * 4));
	}

}
