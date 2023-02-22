public class SimpleThread extends Thread {
    public SimpleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i=1; i<=100; i++) {
            System.out.println(i + " This is FirstThread " + this.getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
