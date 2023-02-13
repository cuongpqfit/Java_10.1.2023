// package lesson_8.Vu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai84 {
    /*Bài tập 4: Viết chương trình cho phép nhập vào n, 
    sau đó nhập vào n phần tử số nguyên dùng ArrayList.
    Sắp xếp các phần tử trong mảng theo thứ tự ngược lại
 */

 public static void main(String[]agrs){

    System.out.print("nhap vao n = ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();


    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++){
        list.add(scn.nextInt());
    }

    //in mang ban dau
    System.out.println("mang ban dau");
    System.out.println(list);

    //sap xep mang
    Collections.sort(list, Collections.reverseOrder());
    System.out.print(list);


}

}