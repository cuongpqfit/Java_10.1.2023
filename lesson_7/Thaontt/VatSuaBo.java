import java.util.Scanner;

public class VatSuaBo {
    public static void main (String[] args){
        //nhap so con bo cua dan bo
        System.out.print("Nhap so con bo cua dan bo : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] milk = new int[n];
        System.out.println("Nhap so lit sua bo cua tung con bo truoc khi vat sua !");
        for (int i = 0; i < n; i++) {
            System.out.print("Con bo thu " + i + " se co the vat duoc : ");
            milk[i] = scanner.nextInt();
        }
        //de so luong sua vat duoc la nhieu nhat thi vat sua tu con bo co san luong it nha
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
            if(milk[j] > milk[j + 1]){
                temp = milk[j];
                milk[j] = milk[j +1];
                milk[j + 1] = temp;
            }
        }
        System.out.println("---------------");
        //tinh so luong sua nhieu nhat
        int sum = 0;
        for (int i = 0; i < milk.length; i++) {
            sum = sum + (milk[i] - i);
        }
        System.out.println("San luong co the vat nhieu nhat la "+ sum +" lit sua");
    }
}
