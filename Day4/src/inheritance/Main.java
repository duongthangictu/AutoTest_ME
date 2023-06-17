package inheritance;

public class Main {

	public static void main(String[] args) {
		System.out.println("Sinh Vien ------------- ");
		SinhVien1 sv1 = new SinhVien1();
		// Lop sinh vien ke thua lop Nguoi nen ke thua ca thuoc tinh name va phuong thuc diChoi
		sv1.name= "Minh";
		sv1.diChoi();
		
		// Thuoc tinh va phuong thuc rieng cua lop SinhVien
		sv1.studentId = 1234;
		sv1.diHoc();
		
		
		System.out.println("\nGiao Vien ------------- ");
		GiaoVien1 gv1 = new GiaoVien1();
		// Lop GiaoVien ke thua lop Nguoi ne ke thua ca thuoc tinh name va phuong thuc
		gv1.name = "Mr.Thu";
		gv1.diChoi();
		
		// Thuoc tinh va phuong thuc rieng cua lop GiaoVien
		gv1.teacherId = 112233;
		gv1.diDay();
	}

}
