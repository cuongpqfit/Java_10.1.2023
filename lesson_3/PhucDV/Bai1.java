package PhucDV;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng : ");
        int soPhanTu = scanner.nextInt();
        int [] arr = new int[soPhanTu];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Nhập vào phần tử arr" + "[" + i + "]");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
//        show array
        System.out.print("Mảng đã nhập : " );
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
//        Tim max, min

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng : " + max);
        System.out.println("Giá trị nhỏ nhất của mảng : " + min);
    }
}
