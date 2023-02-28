import java.util.*;

public class Bai2 {
    public static  void main(String[] args){

        LinkedList<Integer>linkedList = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu "+"[" + i + "] ");
            linkedList.add(scanner.nextInt());
        }

        System.out.println("Cac phan tu trong list la : " + linkedList  );
        int max = Collections.max(linkedList);
        System.out.println( "Gia tri lon nhat la : "+ max);

    }

}

