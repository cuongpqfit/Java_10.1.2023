package PhamBaMinh;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Bai4 {
    //1011010110 1*2^9+0*2^8+1*2^7
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so phan tu cua mang:");
        n= scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(+i + " ");
            stack.push(scanner.nextInt());
        }

        System.out.println(stack);
        int k = stack.size();
        int sum = 0;
        System.out.println("Nhap vao so nguyen a");
        int a = scanner.nextInt();
        for (int j = 0; j< k; j++) {
            sum += stack.pop() * Math.pow(a, j);
        }
            System.out.println("He 10 la:" + sum);


    }



}
