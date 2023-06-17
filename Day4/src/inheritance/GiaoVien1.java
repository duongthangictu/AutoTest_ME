package inheritance;

public class GiaoVien1 extends Nguoi {
	int teacherId;
	
	void diChoi() {
		System.out.println(name + " chi di choi vao cac ngay nghi.");
	}
	
	void diDay() {
		System.out.println(name + " Ma so giao vien: " + teacherId + " day automation tester.");
	}

}
