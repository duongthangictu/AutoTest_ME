package inheritance.ver2;

public class SinhVien1 extends Nguoi {
	// Lop SinhVien ke thua lop Nguoi

	int studentId;

	public void diHoc() {
		System.out.println(name + " Ma so sinh vien: " + studentId + " di hoc thoi");
	}

	@Override
	public void diChoi() {
		System.out.println(name + " Hoc xog roi, di choi thoi.");
	}
}
