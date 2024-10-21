package MultiThreading.Practics;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("hello --"+Thread.currentThread().getName());
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("Done");

    }
}
