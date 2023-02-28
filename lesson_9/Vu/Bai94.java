import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

// package BT;

public class Bai94 {
    /* chuyen he co so B (2-16) sang he co so 10 */
    public static void main(String[]agrs) {
        System.out.print("nhap so n (he co so B ) :");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        //tao 2 stack         
        Deque<Integer> stackInt = new ArrayDeque<Integer>();
        Deque<String> stackStr = new ArrayDeque<String>();

        //tach chuoi vua nhap vao thanh tung ky tu 
        String [] chuoiSo = str.split("");
        for ( String w : chuoiSo){
            stackStr.push(w);
        }
        // for (int i = 0; i < chuoiSo.length ; i++)
    
        //roi bo vao stack1
        
        
        //chuyen nguoc string ve lai integer


        //
        System.out.println(" in lan thu nhat");

        while(!stackInt.isEmpty()){
        System.out.print(stackInt.pop());
        }
     
        System.out.println(" in lan thu 2");
        while(!stackInt.isEmpty()){
            System.out.print(stackInt.pop());
            }

        System.out.println(" in lan thu 3");
        // while(!stackStr.isEmpty()){
        //     System.out.print(stackStr.pop());
        //     }

        System.out.println(" in lan thu 4");
        while(!stackStr.isEmpty()){
            System.out.print(stackStr.pop());
        }

        //lay cac phan tu trong  stack ra

        // System.out.print(w+ " - ");

        // System.out.print("so vua nhap la " + str );
        // slip string vua nhap roi push vao stack
  
        // System.out.print("nhap so b (he co so B (2-16)) :");
        // int b = scn.nextInt();
        // Deque<Integer> stack = new ArrayDeque<Integer>();
        // Deque<String> stack1 = new ArrayDeque<String>();
  
        // 
        
    }
}
