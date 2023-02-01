import java.util.*;
public class Bai1 {
    
    public static void main (String[] args) {         
  
        Scanner sc=new Scanner(System.in);
        System.out.print("Hay nhap chuoi ");
        String chuoi=sc.nextLine();
        int c=0; 
 
        for(int i=0;i<chuoi.length();i++){
        if(chuoi.charAt(i)==' ')
          c++;
        }
         System.out.println("so khoang trang la "+c);
 
 
 }
}
        