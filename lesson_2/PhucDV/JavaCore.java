
package PhucDV;

import java.util.Scanner;

    public class JavaCore {
        public static void main(String[] args) {

//    Bài 1: In các số từ 1 đến 100
            System.out.print("Bài 1 : Dãy số từ 1 đến 100 : ");
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

//  Bài 2: In từ các số từ 100 đến 1
            int sum50Decrease = 0;
            System.out.print("Bài 2 : Dãy số từ 100 đến 1 : ");
            for (int i = 100; i >= 1; i--) {
                System.out.print(i + " ");
                if (i <= 50) {
                    sum50Decrease += i;
                }
            }
            System.out.println();

//  Bài 3: In các số từ 1 đến 100 chia hết cho 3
            int sum50Increase = 0;
            int sumChan = 0;
            int sum5 = 0;
            System.out.print("Bài 3: Dãy số từ 1 đến 100 chia hết cho 3: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
                if (i <= 50) {
                    sum50Increase += i;
                }
                if (i % 2 == 0) {
                    sumChan += i;
                }
                if (i % 5 == 0) {
                    sum5 += i;
                }
            }
            System.out.println();
            System.out.print("Bài 4 : Dãy số từ 1 đến 100 chia hết cho 7: ");
            for (int i = 1; i <= 100; i++) {
                if (i % 7 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            //        Bài 5,6,7,8 : Tổng 50 số đầu
            System.out.println("Bài 5: Tổng 50 số đầu từ 1 đến 50: " + sum50Increase);
            System.out.println("Bài 6: Tổng 50 số đầu từ 50 đến 1: " + sum50Decrease);
            System.out.println("Bài 7: Tổng 50 số chẵn : " + sumChan);
            System.out.println("Bài 8: Tổng 20 số chia hết cho 5 :" + sum5);

//        Bài 9: Bạn hãy viết chương trình tính n! (n!=1*2*3*...*n)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số muốn tính giai thừa n : ");
            int n = scanner.nextInt();
            int giaiThua = 1;
            for (int i = 1; i <= n; i++) {
                giaiThua *= i;
            }
            System.out.println("Bài 9 : n! = " + giaiThua);

//        Bài 10 : Kiểm tra số nguyên tố
            System.out.println("Bài 10 : Nhập số muốn kiểm tra là số nguyên tố : ");
            int soNguyenTo = scanner.nextInt();
            System.out.println("Số đã cho là sô nguyên tố : " + checkSoNguyenTo(soNguyenTo));

/*        Nhập vào một số tự nhiên n,
        in ra màn hình tam giác cân rỗng có chiều cao là n được tạo thành từ những dấu *, có sử dụng vòng lặp.
        */

            System.out.println("Nhập số nguyên n :");
            int m = scanner.nextInt();
            for (int i = 1; i <= m ; i++) {
                for (int j = 1; j <= 2 * m - 1 ; j++) {
                    if(i == m || j == m + 1 - i || j == m - 1 + i){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public static boolean checkSoNguyenTo(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

