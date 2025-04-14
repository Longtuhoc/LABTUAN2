package labtuan2;
import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] dsXe = new Vehicle[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhap thong tin xe thu " + (i + 1));
            System.out.print("Ten chu xe: ");
            String tenChuXe = sc.nextLine();
            System.out.print("Loai xe: ");
            String loaiXe = sc.nextLine();
            System.out.print("Dung tich: ");
            int dungTich = Integer.parseInt(sc.nextLine());
            System.out.print("Tri gia (VND): ");
            double triGia = Double.parseDouble(sc.nextLine());
            dsXe[i] = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
            System.out.println();
        }
        System.out.printf("%-20s %-15s %10s %20s %20s\n",
                "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
        System.out.println("----------------------------------------------------------------------------------------");

        for (Vehicle xe : dsXe) {
            System.out.println(xe);
        }
        sc.close();
    }
}
