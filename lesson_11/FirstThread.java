public class FirstThread implements Runnable {
    private String name;
    private int count = 0;
    private int sleep = 500;
    public FirstThread(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println(i + " This is FirstThread " + this.name + " count " + (count++));

            try {
                Thread.sleep(this.sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
