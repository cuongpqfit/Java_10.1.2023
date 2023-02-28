package Thaontt;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BaiTap03 {
     /*
    Bài 3: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm) dùng HashMap.
Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.
    */

    public static void main (String[] args){
        // nhap mang
        System.out.println("Nhap so phan tu cua mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //double[] a = new double[n];

        Map<Integer, Double> list = new HashMap<Integer, Double>();
        System.out.println();
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i <n; i++) {
            System.out.print("Nhap gia tri cua phan tu thu "+(i+1)+": ");
            Double b = scanner.nextDouble();
            list.put(i,b);
        }
        System.out.println("Input : " );
        list.forEach((key,item) -> System.out.print(item + " "));
        System.out.println();
        //Cach 1
        // double min = list.get(0);
        // for (int i = 0; i < n; i++) {
        //     if(min > list.get(i)) min =list.get(i);
        // }
        //Cach 2
        Double min = Collections.min(list.values());
        System.out.print("Gia tri nho nhat cua mang : " + min);
    }
}
