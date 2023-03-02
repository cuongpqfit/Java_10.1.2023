import java.util.Scanner;

public class Lesson9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Nhập số lượng phần tử của mảng: ");
        n = sc.nextInt();
        int Nums[] = new int[n];
        System.out.print("Hãy nhập các phần tử của mảng: ");
        try {
            for (int i = 0; i < n; i++) {
                Nums[i] = sc.nextInt();
                System.out.println("tai vị trí thứ " + i + " là:" + Nums[i]);
                if (Nums[i] == 100) throw new ArithmeticException("not valid");
            }

        } catch (ArithmeticException ex) {
            for (int i = 0; i < n; i++) {
                System.out.println(Nums[i]);
            }
            System.exit(0);
        }
    }


}
