import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("In put String");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char x ;
        int count = 0;
        for (int i = 0; i < n.length() ; i++) {
            x = n.charAt(i);
            if( x == ' '){
                count++;
            }
        }
        System.out.print("Number of spaces :" + count);
    }
}
