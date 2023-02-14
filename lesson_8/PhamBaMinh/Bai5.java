package PhamBaMinh;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai5 {
    // Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số (0 <= ai <= 9), sau khi chạy thì chương
    //trình sẽ ghi số đó ra dưới dạng chữ dùng HashSet.
    //VD: 1 -> Một, 2 -> Hai, …
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> setA = new HashSet<Integer>();
        int n;
        do {
            System.out.println("Nhap so n");
            n= scanner.nextInt();
            for (int i = 0; i <n ; i++) {
                System.out.println("So phan tu " + i + ":");
                setA.add(scanner.nextInt());
            }

        }while (n<1||n>10);
        System.out.println("Ket qua la:");
        String [] a={" ","Mot","Hai","Ba","Bon","Nam","Sau","Bay","Tam","Chin"};
        for (int i:setA) {
            System.out.println(i+"->"+a[i]);
            
        }
    }


}
