
import java.util.Scanner;

public class bai3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Nhập số lượng tấm vé
    int n = sc.nextInt();
    int[] tickets = new int[n];

    // Nhập số in trên tấm vé
    for (int i = 0; i < n; i++) {
      tickets[i] = sc.nextInt();
    }

    // Sắp xếp tấm vé
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (tickets[i] % 2 == 0 && tickets[j] % 2 != 0) {
          int temp = tickets[i];
          tickets[i] = tickets[j];
          tickets[j] = temp;
        }
      }
    }

    // Xuất kết quả
    for (int i = 0; i < n; i++) {
      System.out.print(tickets[i] + " ");
    }
  }
}
