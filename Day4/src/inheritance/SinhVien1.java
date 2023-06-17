package inheritance;

public class SinhVien1 extends Nguoi {
	//Lop SinhVien ke thua lop Nguoi
	
	int studentId;
	void diHoc() {
		System.out.println(name + " Ma so sinh vien: "+ studentId + " di hoc thoi");
	}
}
