import java.util.Scanner;

public class bai2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Nhập số lượng viên gạch: ");
    int n = scan.nextInt();
    int[] arr = new int[n];

    System.out.println("Nhập trọng lượng của các viên gạch: ");
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    // Sắp xếp mảng theo trọng lượng giảm dần
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // In mảng đã sắp xếp
    System.out.println("Mảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
