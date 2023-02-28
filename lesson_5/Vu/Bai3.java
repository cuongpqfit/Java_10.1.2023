import java.util.*;

public class Bai3 {
    
public static void main(String[]agrs) {

    //sap xep theo chieu giam dan

    Scanner scan = new Scanner(System.in);
    System.out.println(" hay nhap so n =");
    int n = scan.nextInt();
 
    int [] a = new int[n];

    for (int i = 0; i<n ; i++){
     a[i] = scan.nextInt();
 
    }

    for (int i : a)
        System.out.print(i+" ");
        System.out.println();

    //sap xep cac so chan ra truoc
    int temp;
    int last, j;
    for (int i=1; i<n; i++) {
      last = a[i];
        j = i;
        while ((j>0) &&(a[j-1])%2!=0 && a[j]%2==0){
            temp = a[j];
            a[j]= a[j-1];
            a[j-1]=temp;

            j = j-1;
        }
        a[j] = last;
            
        }

    // output

    for (int i : a)
    System.out.print(i+" ");
}
    
}

