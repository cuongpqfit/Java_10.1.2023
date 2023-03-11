package PhamBaMinh;


class Thread31 implements Runnable {
    private String name;
    private int[] input;
    private int n;
    private int starIndex;

    public Thread31(String name, int[] input, int n, int starIndex) {
        this.name = name;
        this.input = input;
        this.n = n;
        this.starIndex = starIndex;
    }

    public void run() {
        for(int i = this.starIndex; i <= this.n; i += 2) {
            if (this.input[i] % 2 == 0) {
                System.out.println(this.name + " so chan la: " + this.input[i]);
            } else {
                System.out.println(this.name + " so le la: " + this.input[i]);
            }
        }

    }
}


public class Bai3 {
    public static void main(String[] args) {
        int[] input = new int[10001];
        int n = 10000;

        for(int i = 1; i <= n; input[i] = i++) {
        }

        Thread31 thread21 = new Thread31("Thread 1: ", input, n, 1);
        (new Thread(thread21)).start();
        Thread31 thread22 = new Thread31("Thread 2: ", input, n, 2);
        (new Thread(thread22)).start();
    }
}
