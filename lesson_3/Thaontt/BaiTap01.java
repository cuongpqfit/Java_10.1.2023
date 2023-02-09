package Thaontt;

public class BaiTap01 {
         /*    1. Nhập vào số lượng phần tử và giá trị từng phần tử của mảng,
       in ra màn hình giá trị lớn nhất, nhỏ nhất của mảng vừa nhập.*/

 //	 nhap phan tu mang
     public static int readInteger(){
 		System.out.print("Nhap so phan tu cua mang : ");
 		Scanner in = new Scanner(System.in);
 		int a = in.nextInt();
 		System.out.println();
 		return a;
 	}
 	public static void main (String[]args){
 		//nhap gia tri mang
 		int n = 0;
 		n = readInteger();
 		int input;
 		int[] A = new int[n];
 		Scanner in = new Scanner(System.in);
 		for (int i = 0; i < n; i++) {
 			System.out.print("Nhap gia tri phan tu thu "+ i + ": ");
 			input = in.nextInt();
 			A[i] = input;
 		}
 		//in mang
 		System.out.print("In ra mang da doc duoc : ");
 		for(int i : A){
 			System.out.print(i + " ");
 		}
 		System.out.println();
 		//tim max va min cua mang
 		int max = 0;
		int min = Integer.MAX_VALUE;
 		for (int i = 0; i < n; i++) {
 			if(A[i] > max) max = A[i];
 			if(A[i] < min) min = A [i];
 		}
 		System.out.println("gia tri lon nhat cua mang la : " + max);
 		System.out.println("gia tri nho nhat cua mang la : " + min);
 	}
}
