// package BT;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bai93 {

    public static void main(String[] agrs) {
        System.out.print("nhap so n (co so 10) :");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print("nhap so b (he co so B (2-16)) :");
        int b = scn.nextInt();
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Deque<String> stack1 = new ArrayDeque<String>();

        int soDu = -1;
        
        // neu he co so bang 10
        if ( b == 10){
            System.out.print(" cung he co so 10 ma xu ly chi nua ba --" + n +" = "+ n   );
            }

        // neu b nam trong khoang 2- 9
        else if (b >= 2 && b < 10 ) {
            int thuong = -1;
            while (thuong != 0){                
            soDu = n % b;
            stack.push(soDu);
            thuong = n/b;
            n = thuong ;
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }

        }
        // neu B nam trong khoang tu 11 -16
        else if (b >10 && b <=16){
            int thuong = -1;
            while (thuong != 0){                
            soDu = n % b;
            thuong = n/b;
            n = thuong ;
            // neu so du nho hon 10 thi gan no vao stack nhu binh thuong
                if (soDu <10){
                    String s = String.valueOf(soDu);
                    stack1.push(s);
                }
            // neu so du tu 10 den 15 thi chuyen no thanh ky tu tuong ung
                if (soDu >= 10 && soDu < 16){
                    String u= null;
                    switch (soDu){
                    case 10 : u = "A"; break;     
                    case 11 : u = "B"; break;     
                    case 12 : u = "C"; break;     
                    case 13 : u = "D"; break;     
                    case 14 : u = "E"; break;     
                    case 15 : u = "F"; break;     
                    }

                    stack1.push(u);
                }
            
            }
            while(!stack1.isEmpty()){
                System.out.print(stack1.pop());
            }
    
        }
        
    }
    
}
