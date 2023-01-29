package PhucDV;

import java.util.Scanner;

public class Bai2 {
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

//        Tim tần suất
        int [] tanSuat = new int[arr.length];
        int maxTanSuat = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && j<i){
                    break;
                }if(arr[i] == arr[j] && j>i){
                    count ++;
                }
            }
            tanSuat[i] = count;
            }
        for (int i = 0; i <tanSuat.length ; i++) {
            if(maxTanSuat < tanSuat[i]){
                maxTanSuat = tanSuat[i];
            }
        }
        System.out.print("Giá trị xuất hiện nhiều nhất là : ");
        for (int i = 0; i < tanSuat.length; i++) {
            if(tanSuat[i] == maxTanSuat){
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("Số lần xuất hiện : " + maxTanSuat);
    }
}
