package btvn_day5;

public class Application {

	public static void main(String[] args) {
//		HinhHoc hinhTron = new HinhTron();
		HinhTron hinhTron = new HinhTron();
		hinhTron.setTenHinh("Hinh Tron 1");
		System.out.println("Ten hinh tron: " + hinhTron.getTenHinh());
		hinhTron.banKinh = 2;
		hinhTron.tinhDienTich();

		System.out.println();
		HinhVuong hinhVuong = new HinhVuong();
		hinhVuong.setTenHinh("Hinh Vuong 1");
		System.out.println("Ten hinh vuong: " + hinhVuong.getTenHinh());
		hinhVuong.chieuDaiMotCanh = 3;
		hinhVuong.tinhDienTich();
	}

}
