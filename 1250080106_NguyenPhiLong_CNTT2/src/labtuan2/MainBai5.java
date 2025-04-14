package labtuan2;
import java.util.Scanner;

public class MainBai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Nhap thong tin sinh vien ===");
        Student st = new Student();
        System.out.print("Nhap ma sinh vien: ");
        st.setStID(sc.nextLine());
        System.out.print("Nhap ten sinh vien: ");
        st.setStName(sc.nextLine());
        System.out.print("Nhap lop: ");
        st.setStClass(sc.nextLine());
        System.out.println("-> Sinh vien: " + st.toString());
        System.out.println("\n=== Nhap thong tin sach ===");
        Book book = new Book();
        System.out.print("Nhap ma sach: ");
        book.setBoCode(sc.nextLine());
        System.out.print("Nhap ten sach: ");
        book.setBoTitle(sc.nextLine());
        System.out.print("Nhap tac gia: ");
        book.setBoAuthor(sc.nextLine());
        System.out.println("\n=== Nhap thong tin san pham ===");
        SanPham sp = new SanPham();
        sp.nhap();
        sp.xuat();
    }
}
