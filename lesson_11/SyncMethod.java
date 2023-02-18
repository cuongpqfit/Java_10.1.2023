public class SyncMethod implements Runnable{
    private String name;
    private int count = 0;
    private int sleep = 500;

    private boolean running = true;
    public SyncMethod(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }
    @Override
    public synchronized void run() {
        while (running) {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i + " This is FirstThread " + this.name + " count " + (count++));

                try {
                    Thread.sleep(this.sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
