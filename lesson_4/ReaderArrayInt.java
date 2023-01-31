import java.util.Scanner;

public class ReaderArrayInt {
    public static String readString() {
        System.out.println("Nhap chuoi ky tu: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        String[] input = a.split("\\s+");



        int[] b = new int[100];
        for (int i =0; i<input.length; i++) {
            b[i] = Integer.parseInt(input[i]);
        }

        for (int i : b) {
            System.out.print(i + " ");
        }
        return a;
    }

    public static void main(String[] args) {
        readString();
    }
}
