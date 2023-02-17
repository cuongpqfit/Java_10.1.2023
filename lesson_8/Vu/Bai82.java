import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Bai82 {
    
    /*Bài 2: Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên dương dùng LinkedList.
Cuối cùng, chương trình sẽ xuất ra phần tử có giá trị lớn nhất.
 */
public static void main(String[]agrs){

 System.out.print("nhap vao n = ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i <n ; i++){
        list.add(scn.nextInt());
    }

    //tim gia tri lon nhat
    int min = Collections.min(list);
    int max = Collections.max(list);

    //output 
     System.out.println("gia tri lon nhat cua mang la Max = " + max);
     System.out.println("gia tri be nhat cua mang la Min = " + min);
    
}
}
