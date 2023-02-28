public class Lesson11 {
    public static void main(String[] args) {
        //1 Công việc với nhiều luồng
        FirstThread t11 = new FirstThread("Thread 1", 500);
        Thread thread11 = new Thread(t11);
        Thread thread21 = new Thread(t11);
        thread11.start();
        thread11.start();


        //Nhiều công việc nhiều luồngi
        //Tao object từ class implement Runable
        FirstThread t1 = new FirstThread("Thread 1", 200);
        FirstThread t2 = new FirstThread("Thread 2", 200);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
//
//
//        //Tao object từ class kế thừa class Thread
        SimpleThread simpleThread1 = new SimpleThread("SimpleThread 1");
        SimpleThread simpleThread2 = new SimpleThread("SimpleThread 2");
        simpleThread1.start();
        simpleThread2.start();

    }
}
