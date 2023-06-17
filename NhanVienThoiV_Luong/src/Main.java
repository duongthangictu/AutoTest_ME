import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int soNhanVienToanThoiGian, soNhanVienThoiVu;
		
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
		NhanVien nhanVien = new NhanVien();
		
		System.out.print("Nhập số nhân viên toàn thời gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        
        System.out.println("\nNHẬP THÔNG TIN NHÂN VIÊN TOÀN THỜI GIAN");
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
        	System.out.println("\nNhập thông tin nhân viên toàn thời gian thứ " + (i + 1) + ": ");
        	 nhanVien = new NhanVienToanThoiGian();
             nhanVien.nhapThongTin();
             arrNhanVien.add(nhanVien);
        	
		}
        
        
        
        System.out.print("\nNhập số nhân viên thời vụ: ");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("\nNHẬP THÔNG TIN NHÂN VIÊN THỜI VỤ");
        for (int i = 0; i < soNhanVienThoiVu; i++) {
        	 System.out.println("\nNhập thông tin nhân viên thời vụ thứ " + (i + 1) + ": ");
        	 nhanVien = new NhanVienThoiVu();
             nhanVien.nhapThongTin();
             arrNhanVien.add(nhanVien);
		}
        
        System.out.println("\nTHÔNG TIN NHÂN VIÊN");
        for (NhanVien nv : arrNhanVien) {
        	nv.tinhLuong();
        	System.out.println(nv.toString());
        }
	}

}
