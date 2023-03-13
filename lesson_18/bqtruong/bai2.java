
//Tạo ra 3 Thread. Mỗi Thread có nhiệm vụ in ra các số từ 1 đến 10 và được định nghĩa trong hàm run().
class Thread1 implements Runnable{
    private  int[] input;
    private String name;
    private int n;

    Thread1(String name, int [] input, int n){
        this.input = input;
        this.name = name;
        this.n = n;

    }
    @Override
    public void run() {

        for( int j = 0; j<n; j++){
            input[j] = j+1;
            System.out.println(this.name + "So : " +input[j]);
        }
    }
}

public class bai2 {
    public static  void main (String [] args){

        int[]input = new int[1000];
        int n = 10;
        for( int i=0; i<n; i++){
            input[i] = i + 1;
        }
        Thread1 thread1 = new Thread1("Thread-1 ", input, n);
        new Thread(thread1).start();

        Thread1 thread2 = new Thread1("Thread-2 ", input,n);
        new Thread(thread2).start();

        Thread1 thread3 = new Thread1("Thread-3 ", input,n);
        new Thread(thread3).start();

    }
}
