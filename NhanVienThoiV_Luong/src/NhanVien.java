import java.util.Scanner;

public class NhanVien {
	private String tenNhanVien;
	protected long luongNhanVien;

	Scanner scanner = new Scanner(System.in);

	public NhanVien() {
		super();
	}

	public NhanVien(String tenNhanVien, long luongNhanVien) {
		super();
		this.tenNhanVien = tenNhanVien;
		this.luongNhanVien = luongNhanVien;
	}

	public void nhapThongTin() {
		System.out.print("Nhap ten nhan vien: ");
		tenNhanVien = scanner.nextLine();
	}

	/// khai báp phương thức tinhLuong() để lớp con có thể ghi đè
	public void tinhLuong() {

	}

	@Override
	public String toString() {
		return "Ten nhan vien " + this.tenNhanVien + ", Luong nhan vien: " + this.luongNhanVien;
	}
}
