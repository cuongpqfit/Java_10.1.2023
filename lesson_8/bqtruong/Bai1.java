import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static  void main(String[] args){

        ArrayList <Integer> arrayList = new  ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu "+"[" + i + "] ");
            arrayList.add(scanner.nextInt());
        }

        System.out.println("Cac phan tu trong list la : " + arrayList  );
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arrayList.get(i);
        }

        double sumTB = sum/n;
        System.out.println("Gia tri trung binh la:" + sumTB);
    }
}


