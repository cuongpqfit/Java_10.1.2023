package PhamBaMinh;

import java.util.Scanner;

public class Bai3 {
    //Số cặp bằng nhau Cho một mảng gồm n số nguyên dương a1, a2, a3, ... an. Hỏi có bao nhiêu cặp số bằng nhau?
    //(Bao nhiêu cặp ai = aj với i ≠ j, (ai, aj) và (aj, ai) chỉ được tính là 1 cặp)
    //Input:
    //    - Dòng thứ nhất là chiều dài n của mảng (1<= n <= 105)
    //    - Dòng thứ hai gồm n số nguyên a1, a2, a3, ... an (1<= ai <= 105), mỗi số cách nhau một khoảng trắng.
    //Output:
    //    - Là số nguyên xác định số lượng các cặp bằng nhau, lưu ý là số lượng này có thể rất lớn nên sử dụng kiểu long long.
    //
    //Input           Output
    //5               1
    //8 2 9 8 1
    //-------------------
    //7               4
    // 6 2 4 2 4 3 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = scanner.nextInt();
        if (n<1||n>105){
            System.out.println("Nhap lai");
            return;
        }
        int[]a= new int[n];
        System.out.println("Nhap vao cac phan tu cua mang");
        for (int i = 0; i < n; i++) {
            System.out.print("["+i+"]");
            a[i] = scanner.nextInt();

        }
        System.out.println("Mang dau la:");
        for (int i:a) {
            System.out.print(i+" ");

        }
        long count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
               if (a[i]==a[j]){
                   count++;

               }
                }

            }
        System.out.println("\nSo luong cap bang nhau la : "+ count);

    }

}
