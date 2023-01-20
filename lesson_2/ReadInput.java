import java.util.Scanner;

public class ReadInput {

    //Doc so nguyen tu ban phim
    public static int readInteger() {
        System.out.println("Nhap so nguyen N: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }

    //Doc chuoi ky tu ban phim
    public static String readString() {
        System.out.println("Nhap chuoi ky tu: ");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        return a;
    }

    //Doc so thuc
    public static float readFloat() {
        System.out.println("Nhap so thuc: ");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        return a;
    }

    public static void main(String[] args) {
        int a;
        a = 0;
        a = readInteger();

        String inString = readString();
        float inFloat = readFloat();

        System.out.println("Ket qua sau khi nhap: " + a);
        System.out.println("Ket qua sau khi nhap: " + inString);
        System.out.println("Ket qua sau khi nhap: " + inFloat);
    }
}
