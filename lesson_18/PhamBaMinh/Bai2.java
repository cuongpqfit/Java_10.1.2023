package PhamBaMinh;



class Thread21 implements Runnable {
    private String name;
    private int[] input;
    private int n;

    public Thread21(String name, int[] input, int n) {
        this.name = name;
        this.input = input;
        this.n = n;
    }

    public void run() {
        for(int j = 0; j < this.n; ++j) {
            this.input[j] = j + 1;
            System.out.println(this.name + "So thu " + this.input[j]);
        }

    }
}
public class Bai2 {
    public static void main(String[] args) throws InterruptedException {
        int[] input = new int[10000];
        int n = 10;

        for(int i = 0; i < n; ++i) {
            input[i] = i + 1;
        }

        System.out.println(" ---------");
        Thread21 thread1 = new Thread21("Thread -1", input, n);
        (new Thread(thread1)).start();
        Thread21 thread2 = new Thread21("Thread -2 ", input, n);
        (new Thread(thread2)).start();
        Thread21 thread3 = new Thread21("Thread -3 ", input, n);
        (new Thread(thread3)).start();
        System.out.println(" ---------");
    }
}
