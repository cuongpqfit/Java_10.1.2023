import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        HashMap<String,Integer> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap tu khoa :");
            String key = scanner.nextLine();
            System.out.println("Nhap gia tri:");
            int value= scanner.nextInt();
            hashMap.put(key,value);
        }

        System.out.println("Cac phan tu trong list la : " + hashMap);
        int min = Collections.min(hashMap.values());
        System.out.println("Gia tri nho nhat la: " + min);

    }
}
