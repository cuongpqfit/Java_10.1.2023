import java.util.Scanner;

public class BubbleSort {
    public static void main (String[] args){
//   begin BubbleSort(list)

//    for all elements of list
//       if list[i] > list[i+1]
//          swap(list[i], list[i+1])
//       end if
//    end for

//    return list

// end BubbleSort
        System.out.println("Nhap so phan tu cua mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        System.out.println("Nhap cac phan tu cua mang : ");
        for (int i = 0; i < n; i++) {
            System.out.print("A["+ i + "] = ");
            list[i] = scanner.nextInt();
        }
        System.out.println("Day so input : ");
        for(int i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
                if(list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
        }
        System.out.println("Day so sau khi sap xep : ");
        for(int i : list){
            System.out.print(i + " ");
        }
    }
}
