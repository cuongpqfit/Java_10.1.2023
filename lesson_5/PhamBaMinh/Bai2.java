package PhamBaMinh;

import java.util.Scanner;

public class Bai2 {
    //Nhà máy gạch quái đản
    //Một nhà máy có N viên gạch, mỗi viên gạch có 1 trọng lượng là số nguyên. Hãy giúp nhà máy sắp xếp các viên gạch theo
    //trọng lượng giảm dần
    //Input: gồm 2 dòng
    //    - Dòng thứ nhất là số nguyên n biểu thị số lượng các viên gạch
    //    - Dòng thứ hai gồm n số nguyên a1, a2, a3, ... an, mỗi số cách nhau một khoảng trắng là trọng lượng các viên gạch.
    //Output:
    //    - Dãy trọng lượng các viên gạch theo thứ tự giảm dần.
    //Ví dụ:
    //    Input           Output
    //    4               5 3 2 1
    //    3 2 1 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr =  new int[n];
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("["+i+"]");
            arr[i] = scanner.nextInt();

        }
        System.out.println("Mang ban dau la :");
        for (int i :arr) {
            System.out.print(+i+" ");
        }
        int j,x,tmp;
        for (int i = 1; i <n ; i++) {
            x = arr[i];
            j = i;
            while (j > 0 && arr[j-1]<x){
                tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = tmp;

                j= j-1;
            }
            arr[j] = x;
            
        }
        System.out.println("\n");
        System.out.println("Mang sau khi sap xep la: ");
        for (int i:arr ) {
            System.out.print(+i +" ");
        }

            
    };


}
