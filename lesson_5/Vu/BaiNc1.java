import java.util.*;

public class BaiNc1 {
    
public static void main(String[]agrs) {

    //nhap soluong nam va nu

    Scanner scan = new Scanner(System.in);
    System.out.print (" hay nhap so n =");
    int n = scan.nextInt();

    System.out.print(" hay nhap so m =");
    int m = scan.nextInt();
 
    int [] a = new int[n];
    for (int i = 0; i<n ; i++){
     a[i] = scan.nextInt();
    }

    int [] b = new int[m];
    for (int i = 0; i<m ; i++){
     b[i] = scan.nextInt();
    }


    
/* 
    //sap xep theo chieu giam dan
    int temp;
    int last, j;
    for (int i=1; i<n; i++) {
      last = a[i];
        j = i;
        while ((j>0) &&(a[j-1])< last){
            temp = a[j];
            a[j]= a[j-1];
            a[j-1]=temp;

            j = j-1;
        }
        a[j] = last;
            
        }

*/
    // output

    for (int i : a)
    System.out.print(i+" ");

    for (int i : b)
    System.out.print( i+" ");


}
    
}

