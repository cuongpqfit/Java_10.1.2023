// package lesson_8.Vu;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Bai83 {
    /*Bài 3: Viết chương trình cho phép nhập vào n, 
    sau đó nhập vào n phần tử số nguyên (có thể dương hoặc âm) dùng HashMap.
    Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị nhỏ nhất. */
    public static void main(String[]agrs){

        System.out.print("nhap vao n = ");
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
       
           HashMap<Integer, Integer> map = new HashMap<>();
           for (int i = 0; i <n ; i++){
               map.put(scn.nextInt(), scn.nextInt());
           }
       
           // in ra mang Hashmap
           System.out.println(map);
           map.forEach ((key, item) ->System.out.println(key + " " +item));

           //tim gia tri be nhat
           int min = Collections.min(map.values());
            //    int max = Map.max(list);
           int max = Collections.max(map.values());
       
           //output 
            System.out.println("gia tri lon nhat cua mang la Max = " + max);
            System.out.println("gia tri be nhat cua mang la Min = " + min);
           
       }
}
