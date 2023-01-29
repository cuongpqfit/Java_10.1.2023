import java.util.Scanner;

public class ReaderArray {
    //Doc mang 1 chieu tu ban phim
    public static int readInteger() {
        System.out.println("Nhap so phan tu cua mang: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static int readIntegerX() {
        System.out.println("Nhap so X: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static void main(String[] args) {
        int n;
        n = 0;
        n = readInteger(); //
        int intput;
        int X = readIntegerX(); //;

        int[] A = new int[n];

        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            System.out.println("Nhap gia tri phan tu thu "+ i +": ");
            intput = in.nextInt();
            A[i] = intput;
        }

        //In ra mang da doc duoc;
        System.out.println("In ra mang da doc duoc:");
        for (int i: A) {
            System.out.print(i + " ");
        }

        System.out.println("");

        int max = 0;
        int min = Integer.MAX_VALUE;

        boolean check = false;
        for (int i=0; i<n; i++) {
            if (X == A[i]) {
                check = true;
                break;
            }
            if (A[i] > max)  max = A[i];
            if (A[i] < min) min = A[i];
        }

        if (check) {
            System.out.println("Da tim duoc X trong A:");
        } else {
            System.out.println("Khong tim duoc X trong A:");
        }
    }
}
