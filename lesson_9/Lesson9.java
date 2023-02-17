import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson9 {
    public static int readInteger() {
        System.out.println("Nhap so nguyen N: ");
        Scanner in = new Scanner(System.in);
        int a = 0;
//        try {
//            a = in.nextInt();
//        } catch (InputMismatchException ex) {
//            System.out.println("Oh nhap sai roi nhap lại nhé");
//        }
//
//        try {
//            int arr[] = new int[5];
//            arr[2] = 2;
//            System.out.println("arr[5] = " + arr[2]);
//
//            int zero = 0;
//            int average = 10 / zero;
//            System.out.println("Average = " + average);
//
//            String obj = null;
//            System.out.println(obj.length());
//        } catch (Exception ex) {
//            //Xy ly
//            System.out.println(ex);
//        }


//        try {
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            //Xy ly
//        }
//
//        try {
//            int zero = 0;
//            int average = 10 / zero;
//            System.out.println("Average = " + average);
//        }  catch (ArithmeticException ex) {
//            System.out.println("Thong bao khi co exception: ArithmeticException");
//            System.out.println(ex);
//        }
//
//        try {
//            String obj = null;
//            System.out.println(obj.length());
//        } catch (NullPointerException ex) {
//            System.out.println("Thong bao khi co exception: NullPointerException");
//            ex.printStackTrace();
//        }

        try {
            int res = 10/2;
            System.out.println("10/2 = " + res);
        } finally {
            System.out.println("Khối lệnh finally luôn được thực thi");
        }

//        try {
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//        } catch (NullPointerException ex) {
//            System.out.println(ex);
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }


//        try {
//            int arr[] = new int[5];
//            arr[5] = 4;
//            System.out.println("arr[5] = " + arr[5]);
//        } catch (NullPointerException ex) {
//            System.out.println(ex);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println(ex);
//            System.exit(0);
//        } finally {
//            System.out.println("Khối lệnh finally luôn được thực thi");
//        }


        try {
            int arr[] = new int[5];
            arr[2] = 4;
            System.out.println("arr[5] = " + arr[2]);

            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArrayIndexOutOfBoundsException ex) {
                int zero = 1;
                int average = 10 / zero;
                System.out.println("Average = " + average);
                ex.printStackTrace();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");

        return a;
    }

    public static void main(String[] args) {
        int a;
        a = 0;
        a = readInteger();

//        String inString = readString();
//        float inFloat = readFloat();

        System.out.println("Ket qua sau khi nhap: " + a);
//        System.out.println("Ket qua sau khi nhap: " + inString);
//        System.out.println("Ket qua sau khi nhap: " + inFloat);



    }
}
