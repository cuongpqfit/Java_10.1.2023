import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai4 {
    public static  void main(String[] args){

        ArrayList<Integer> arrayList = new  ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu "+"[" + i + "] ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Cac phan tu trong list la : " + arrayList  );
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println("\nList sau khi duoc sap xep dao nguoc la:" + arrayList);

    }
}


