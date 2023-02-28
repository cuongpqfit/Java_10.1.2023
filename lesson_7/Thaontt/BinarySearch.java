import java.util.Scanner;

public class BinarySearch {
    public static void main (String[] args){
        // nhap mang
        System.out.print("Nhap so phan tu cua mang : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        System.out.println();
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
        // sap xep mang tang dan bang thuat toan noi bot
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
        System.out.println();
        //tim kiem vi tri bang thuat toan nhi phan
        System.out.println("Nhap phan tu can tim trong mang :");
        int x = scanner.nextInt();
        int midPoint = 0; //
        int lowerBound = 1;
        int upperBound = list.length;
        boolean check = false; //
        while (upperBound > lowerBound){
            midPoint = lowerBound + (upperBound - lowerBound) /2;
            if(list[midPoint] == x){
                check=true;
                break;
            }
            else if(list[midPoint]<x){
                lowerBound = midPoint + 1;
            }else {
                upperBound = midPoint - 1;
            }
        }
        if(!check){
            System.out.println("Khong ton tai");
        }else {
            System.out.println("Vi tri cua "+ x +" duoc tim thay tai "+ midPoint);
        }
    }
}
