package MultiThreading.DeadLock;

public class DeadLockDemo {
    public final static Object lockA=new Object();
    public final static Object lockB=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (lockA){
                System.out.println("Thread 1: Holding lockA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){
                    System.out.println("Thread 1: Holding lockB");
                }
            }
        });

        Thread t2=new Thread(()->{
            synchronized (lockB){
                System.out.println("Thread 2: Holding lockB");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockA){
                    System.out.println("Thread 2: Holding lockA");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
//output - Thread 1: Holding lockA
//Thread 2: Holding lockB                it got hand due to deadLock


// HOW TO RESOLVE --- USE Reetrant lock