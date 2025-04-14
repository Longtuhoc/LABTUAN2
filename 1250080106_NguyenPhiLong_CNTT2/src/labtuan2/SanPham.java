package labtuan2;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham() {

    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double tinhThueNhapKhau() {
        return donGia * 0.1;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap giam gia: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }
    
 public void xuat() {
        System.out.println("=== Thong tin san pham ===");
        System.out.println("Ten san pham: " + tenSp);
        System.out.printf("Don gia: %.2f\n", donGia);
        System.out.printf("Giam gia: %.2f\n", giamGia);
        System.out.printf("Thue nhap khau: %.2f\n", tinhThueNhapKhau());
    }
}
