package PhamBaMinh;

import java.util.Scanner;

public class Bai3 {
    //Rạp hát bán các tấm vé cho các khán giả, mỗi tấm vé sẽ là 1 số nguyên dương. Hãy giúp rạp hát sắp xếp các tấm vé sao cho
    //tấm vé số chẵn thì sẽ bán hết trước rồi mới đến các tấm vé số lẻ.
    //Input: gồm 2 dòng
    //    - Dòng thứ nhất là số nguyên n biểu thị số lượng các tấm vé
    //    - Dòng thứ hai gồm n số nguyên a1, a2, a3, ... an, mỗi số cách nhau một khoảng trắng là số in trên các tấm vé.
    //Output:
    //    - Dãy các tấm vé đã được sắp xếp.
    //
    //Ví dụ:
    //    Input           Output
    //    4               2 4 3 5
    //    3 2 4 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So luong cac tam ve: ");
        int n = scanner.nextInt();
        int []arr = new int[n];
        System.out.println("Nhap So in tren tam ve: ");
        for (int i = 0; i <n ; i++) {
            System.out.print("["+i+"]");
            arr[i] =scanner.nextInt();
        }
        System.out.println("So cua cac tam ve la: ");
        for (int i:arr) {
            System.out.print(+i+" ");
        }
        int tmp;
        for (int i = 0; i <n ; i++) {
            for (int j =i; j < n; j++) {
                if (arr[j]%2 == 0){
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= tmp;
                    break;
                }

            }

        }
        System.out.println("\n");
        System.out.println("So ve sau khi sap xep la: ");
        for (int i:arr) {
            System.out.print(+i+" ");

        }


    }
}
