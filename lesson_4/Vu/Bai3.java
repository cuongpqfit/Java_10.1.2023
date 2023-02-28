import java.util.*;

public class Bai3 {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.print("Hay nhap chuoi s1 ");
    String s1 = sc.nextLine();
    
    
    System.out.print("Hay nhap chuoi thu 2 ");
    String s2 = sc.nextLine();
 
    s1 = s1.concat(s2);
    System.out.print(s1);

    }
}
