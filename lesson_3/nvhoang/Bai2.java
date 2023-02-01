package Lesson3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n, dem;
        int[] a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
        a = new int[n]; // Cấp phát cho mảng
        b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = -1;
        }
        // Nhập giá trị các phần tử của mảng
        // Thực hiện bài này sẽ sử dụng 2 vòng lặp và thêm 1 mảng biến đếm
        // Khởi tạo tất cả các phần tử ở mảng đếm = -1 những phần tử nào khi xét
        // đã bị lặp rồi thì gán biến đếm tại vị trí tương ứng = 0 sau đó xét những
        // phần tử có giá trị khác 0 và gán nó với giá trị của biến đếm
        // Vòng ngoài chạy từ i đến < n
        // Vòng 2 check i

        // Đếm số lần xuất hiện của các phần tử trong mảng
        for (int i = 0; i < n; i++) {
            dem = 1;
            for (int j = i + 1; j < n; j++) {
                if (b[j] != 0 && a[i] == a[j]) {
                    dem++;
                    b[j] = 0;
                }
            }
            if (b[i] != 0) {
                b[i] = dem;
            }
        }
        // Tìm số lần xuất hiện max
        int max = b[0];
        for (int i = 0; i < n; i++) {
            if (b[i] > max) {
                max = b[i];
            }

        }
        System.out.println("Số lần xuất hiện max: " + max + ", các phần tử : ");
        for (int i = 0; i < n; i++) {
            if (b[i] == max) {
                System.out.println(a[i]);
            }
        }
        System.out.println();
    }
}
