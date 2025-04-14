package labtuan2;
import java.util.Scanner;

public class MainSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5f, 8.5f);
        SinhVien sv2 = new SinhVien(22222, "Le Thi Bong", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ho va ten cua sinh vien sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.print("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.print("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(scanner.nextFloat());
        System.out.printf("%-7s %-20s %7s %8s %8s\n",
                "masv", "hoten", "diemlt", "diemth", "diemtb");
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);
        scanner.close();
    }
}
