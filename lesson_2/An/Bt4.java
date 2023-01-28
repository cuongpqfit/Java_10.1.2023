package An;
public class Bt4 {
    public static void main(String[] args) {
        System.out.println("Các số 99 đến 1 chia hết cho 7 là: ");
        for (int i = 99; i >= 1; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
