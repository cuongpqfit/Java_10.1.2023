package bqtruong;

public class Bai8 {
    public static void main(String[] args){
        int i;
        int Sum=0;
        for(i=5;i<=100;i++){
            if(i%5==0){
                Sum=Sum+i;
            }
        }
        System.out.println("Tong la:"+Sum);

    }
}
