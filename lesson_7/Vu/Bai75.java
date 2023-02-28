import java.util.Scanner;
public class Bai75 {
public static void main(String[]agrs) {

    System.out.println( " hay nhap so n = ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] A = new int [n];

    System.out.println( " hay nhap ca so trong mang A theo thu tu lon dan ");
    for (int i= 0; i <n ; i ++){
    A[i] = scn.nextInt();        
    }
    
    for (int i : A)
    System.out.print( i + " ") ;

    System.out.println( " hay nhap key muon tim, KEY = ");
    int key = scn.nextInt();

    int position = -1;
    int lowerBound = 0;
    int upperBound = n-1;



    while (lowerBound <= upperBound){
        int midPoint = (lowerBound + upperBound) / 2;
        if (A[midPoint]==key){
            position = midPoint;
            break;
        } else if (A[midPoint]< key){
            lowerBound = midPoint +1;
        } else if (A[midPoint] > key){
            upperBound = midPoint -1;
        }
    }
    if (position < 0){
        System.out.println(" khong tim thay key");
    } else System.out.println (key + "nam o vi tri "+ (position+1));

    }
}
