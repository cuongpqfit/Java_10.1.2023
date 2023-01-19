import java.util.Scanner;

public class Fibonaci {
    //0, 1, 1, 2, 3, 5, 8, 13

    //Nhap tu ban phim so N va in ra N so fibo
    public static int readInteger() {
        System.out.println("Nhap so nguyen N: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    public static void main(String[] args) {
        long n = readInteger();
        if (n<10) {
            System.out.println("N là số âm không chạy được");
        }
        long x1 = 0;
        long x2 = 1;

        long fi = 1;

        System.out.print(x1 + " " + x2 + " ");
        for (int j=1; j<n; j++) {
            fi = x1 + x2;
            System.out.print(fi + " ");

            x1 = x2;
            x2 = fi;
        }
    }
}
