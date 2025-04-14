
package labtuan2;
import java.util.Scanner;
import java.util.Arrays;
public class BAI1 {
    
    public static int[] nhapMang(Scanner scanner){
        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++ ){
            System.out.print("Nhap phan tu thu: " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void xuatMang(int[] arr){
        System.out.print("Cac phan tu trong mang: ");
         for (int num : arr) {
            System.out.print(num + " ");
         }
        System.out.println();
    }
    
    public static void timViTriX(int[] arr, int x) {
        boolean timThay = false;
        System.out.print("Vi tri cua " + x + " trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               System.out.print(i + " ");
               timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay so " + x + " trong mang.");   
        } else {
            System.out.println();
        }
    }
    
    public static int timGiaTriLonNhat(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int timGiaTriNhoNhat(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
               min = arr[i];
            }
        }
        return min;
    }
    
    public static void timViTriMax(int[] arr, int max) {
        System.out.print("Vi tri phan tu lon nhat (" + max + "): ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void sapXepTangDan(int[] arr) {
       Arrays.sort(arr); 
       System.out.println("Mang sau khi sap xep tang dan:");
       xuatMang(arr);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int[] mang = nhapMang(scanner);        
        xuatMang(mang);
        System.out.print("Nhap so nguyen x can tim: ");
        int x = scanner.nextInt();
        timViTriX(mang, x);
        int max = timGiaTriLonNhat(mang);
        System.out.println("Gia tri lon nhat: " + max);
        int min = timGiaTriNhoNhat(mang);
        System.out.println("Gia tri nho nhat: " + min);
        timViTriMax(mang, max);
        sapXepTangDan(mang);
        scanner.close();
    }    
}
