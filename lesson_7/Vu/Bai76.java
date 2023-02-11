import java.util.Scanner;;
public class Bai76 {
    public static void main(String[]args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Hay nhap so luong con bo n = ");
        int n = scn.nextInt();
        int [] a = new int [n];
        System.out.print("Hay nhap san luong cua  cac con bo ");
        for (int i = 0; i < n ; i ++){
             a[i] = scn.nextInt();
        }
        

        // sap xep san luong sua cac con bo theo thu tu giam dan

        for (int i = 0; i < n-1 ; i ++){
            for (int j = 0 ; j < n-1 ; j++){
                int tmp;
                if ( a[j] < a[j+1]){
                    tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }

            }
        }

        //in ra san luong sua cua cac con bo  sau khi sap xep
        System.out.println (" san luong sua cua nhung con bo sau khi sap xep ");
        for (int i : a)
        System.out.print(i+ " ");
        System.out.println("");



        //chuong trinh

        for (int i = 0 ; i < n ; i++){
            for (int j = i+1 ; j < n ; j++){
            a[j] = a[j] - 1;
            }
        }

        for (int i : a)
        System.out.print(i + " ");
        
        int sum = 0;
        for (int i = 0 ; i < n ; i++ ){
            if( a[i] >=0){
            sum = a[i] + sum;
            }
        }

        System.out.print("\n  san luong sua vat duoc " + sum );
    }
}
/*
 * Vào một buổi sáng anh Bo sắp một đàn bò gồm n con bò để vắt sữa. Anh dự kiến là vào sáng hôm đó, con bò thứ i có khả
năng sẽ vắt được ai lít sữa. Tuy nhiên đàn bò của anh có đặc tính là cứ mỗi lần vắt sữa một con, những con còn lại trông
thấy sợ quá nên sẽ bị giảm sản lượng mỗi con 01 lít sữa. Nếu vắt sữa con bò thứ nhất, n-1 con còn lại bị giảm sản lượng.
Sau đó vắt sữa con bò thứ hai thì n-2 con còn lại bị giảm sản lượng.... Bạn hãy giúp anh Bo tính xem thứ tự vắt sữa bò
như thế nào để số lượng sữa vắt được là nhiều nhất nhé.
Input: gồm 2 dòng
    - Dòng thứ nhất là số nguyên n (1 ≤ n ≤ 100) là số lượng con bò.
    - Dòng thứ hai gồm n số nguyên a1, a2,..., an (1 ≤ ai ≤ 1000) là sản lượng sữa của các con bò.
Output:
- Là một số nguyên xác định số lít sữa nhiều nhất mà anh Bo có thể vắt được.

Input           Output
4               10
4 4 4 4
----------------------
4               6
2 1 4 3

 */