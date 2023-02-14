import java.util.ArrayList;
import java.util.Scanner;


public class Bai81 {
    /*Bài 1:Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dùng ArrayList.
Cuối cùng, chương trình sẽ xuất ra giá trị trung bình của mảng này. */

public static void main(String[]agrs){

    System.out.print("nhap vao n = ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    ArrayList<Integer> list = new ArrayList<>(100);
    for (int i = 0; i <n ; i++){
        list.add(scn.nextInt());
    }

    //tinh gia tri trung binh
    double sum = 0  ; 
    for (int i = 0; i <n ; i++){
    sum += list.get(i);
    }
    double avg = sum/n;
    System.out.print("Gia tri Trung Binh = " + avg);

}
}
