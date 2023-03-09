
class Thread1 implements Runnable {
    private String name;
    private int[] input;
    private int n, startIndex;

    Thread1(String name, int[] input, int n, int startIndex) {
        this.name = name;
        this.input = input;
        this.n = n;
        this.startIndex = startIndex;
    }

    @Override
    public void run() {

        for (int j=startIndex; j<startIndex + n/4; j++) {
            boolean primeNumber = true;
            for (int i = 2; i < input[j]; i++) {
                if (input[j] % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                System.out.println(this.name + " La so nguyen to: " + input[j]);
            }

        }

    }
}

public class NguyenToThread {
    public static void main(String[] args) {
        //Bạn hãy nhập vào một số N bất kỳ và kiểm tra xem N có phải số nguyên tố hay không?
        long lBeign = System.currentTimeMillis();

        int[] input = new int[1000000];
        int n = 900000;

        System.out.print("Mang input ");
        for (int i = 0; i < n; i++) {
            input[i] = i + 1;
            //System.out.print(i+1 + " ");
        }
        System.out.println();

        Thread1 thread1 = new Thread1("Thread-1", input, n, 2);
        new Thread(thread1).start();

        Thread1 thread2 = new Thread1("Thread-2", input, n, (n/4));
        new Thread(thread2).start();

        Thread1 thread3 = new Thread1("Thread-3", input, n, (n/4)*2);
        new Thread(thread3).start();

        Thread1 thread4 = new Thread1("Thread-4", input, n, (n/4)*3);
        new Thread(thread4).start();

        long lEnd = System.currentTimeMillis();
        System.out.println("Thoi gian thuc hien: " + (lEnd - lBeign));
    }
}
