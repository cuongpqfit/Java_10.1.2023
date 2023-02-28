package PhamBaMinh;

import java.util.*;

public class Bai3 {
    // Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm) dùng HashMap.
    //Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang:");
        int n = scanner.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            System.out.println("So phan tu " + i + ":");
            System.out.println("Nhap chu :");
            scanner.nextLine();String key =scanner.nextLine();
            System.out.println("Nhap so");
            int value= scanner.nextInt();
            hashMap.put(key,value);
        }
        System.out.print(hashMap+" ");
        int min = Collections.min(hashMap.values());
        System.out.println("Gia tri nho nhat la: "+ min);



    }

}
