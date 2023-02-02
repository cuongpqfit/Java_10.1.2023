import java.util.Scanner;

public class StringType {


    public static void main(String[] args) {
        String str1 = "AAA"; //heap
        String str2 = "AAA"; //heap
        String str3 = new String( new char[]{'A', 'A', 'A'}); //Pool Heap


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

    }
}


