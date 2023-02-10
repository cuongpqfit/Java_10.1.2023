package PhucDV;

import java.util.Arrays;
import java.util.Scanner;

public class Bai762VatSuaBo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào dãy số tương ưngs với số lít sữa của từng con bò :  ");
        String s1 = scanner.nextLine();
        String[] str1 = s1.split("\\s++");
        int [] listSuaBo = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            listSuaBo[i] = Integer.parseInt(str1[i]);
        }
        sort(listSuaBo);
        System.out.println(Arrays.toString(listSuaBo));
        int sum = listSuaBo[0];
        for (int i = 1; i < listSuaBo.length; i++) {
            if(listSuaBo[i] > i){
            sum += listSuaBo[i] - i;
            }
        }
        System.out.println("Tổng lít sửa bò là : " + sum);

    }

    public static void sort(int [] str){
        for (int i = 1; i < str.length; i++) {
            int j = i;
            while(j > 0 && str[j - 1] < str[j]){
                int tmp = str[j - 1];
                str[j - 1] = str[j];
                str[j] = tmp;
                j--;
            }
        }
    }
}
