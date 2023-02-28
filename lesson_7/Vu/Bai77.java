import java.util.ArrayList;

public class Bai77 {
    public static void main(String []agrs) {

    // int[]a = {1,5,7,10};
    // int[]b = {4,6,8,12};   

    // sau khi nhap vao thi sap xep mang theo chieu tang dan


    //mang da dc sap xep
    int[]a = {1,2,3,6,9,11,15};
    int[]b = {4,7,9,10,12,14,16};
    int n = a.length;
    for (int i = 0; i < n; i++){
    System.out.print(a[i]+" ");
    }
    System.out.println();
    for (int i = 0; i < n; i++){
    System.out.print(b[i]+" ");
    }
    System.out.println();

    int k = 0;
    int count = 1;
    
    for (int i = k; i < n; i++){
        i= k;
        for (int j= k; j < n ; j++ ){
            if( a[j] > b[i]){
                count ++;
                k = j;
                break;
            }

        }

    }
    System.out.println("so doan bieu dien  = "+ count);

}
}
