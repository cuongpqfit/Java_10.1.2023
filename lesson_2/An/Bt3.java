package An;

public class Bt3 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 3 là: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
