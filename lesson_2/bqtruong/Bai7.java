package bqtruong;

public class Bai7 {
    public static void main(String[] args){
        int i;
        int SumChan=0;
        for(i=2;i<=100;i++){
            if(i%2==0){
                SumChan=SumChan+i;
            }
        }
        System.out.println("Tong 50 so chan dau tien bat dau tu 2 la:"+SumChan);

    }
}
