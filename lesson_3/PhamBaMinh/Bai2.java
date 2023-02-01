package PhamBaMinh;

import java.util.Scanner;

public class Bai2 {
    //Nhập vào số phần tử và giá trị từng phần tử của mảng. Tìm phần tử có tần suất xuất hiện nhiều nhất trong mảng và xuất hiện bao nhiêu lần, sau đó in ra màn hình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n, count;
        int[] arr, res;
        n = scanner.nextInt();
        arr = new int[n];
        res = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap cac phan tu "+i);
            arr[i] = scanner.nextInt();
            res[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (res[j] != 0 && arr[i] == arr[j]) {
                    count++;
                    res[j] = 0;
                }
            }
            if (res[i] != 0) {
                res[i] = count;
            }

        }
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if(res[i]>max){
                max = res[i];

            }

        }
        System.out.println("So lan xuat hien Max "+max);
        System.out.print("Phan tu co so lan xuat hien nhieu nhat la :");
        for (int i = 0; i <n ; i++) {
            if (res[i]==max){
                System.out.println(arr[i]);
            }

        }
    }
}
