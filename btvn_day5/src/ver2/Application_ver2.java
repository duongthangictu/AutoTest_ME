package ver2;

import java.util.Scanner;

public class Application_ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// diện tích hình tròn = 2*3.14 * banKinh
		HinhTron_ver2 hinhTron = new HinhTron_ver2();
		hinhTron.setTenHinh("Hinh tron loai 1");
		System.out.println(hinhTron.getTenHinh());

		System.out.println("Nhap ban kinh: ");
		hinhTron.banKinh = sc.nextInt();
		hinhTron.tinhDienTich();

		System.out.println("\n=========");

		// diện tích hình vuông= chieuDaiMotCanh * 4
		HinhVuong_ver2 hinhVuong = new HinhVuong_ver2();
		hinhVuong.setTenHinh("Hinh Vuong loai 2");
		System.out.println(hinhVuong.getTenHinh());
		System.out.println("Nhap chieu dai 1 canh: ");
		hinhVuong.chieuDaiMotCanh = sc.nextInt();
		hinhVuong.tinhDienTich();
	}
}
