import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n;
        n= sc.nextInt();
        long giai_thua = 1;
        for (int i = 1; i <=n ; i++) {
            giai_thua = giai_thua*i;

        }
System.out.println("Giai thua cua "+ n + " la : "+ giai_thua);
        }
    }

