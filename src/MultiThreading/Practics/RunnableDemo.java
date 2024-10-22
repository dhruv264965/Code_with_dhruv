package MultiThreading.Practics;

public class RunnableDemo {
    public static void main(String[] args) {
        MyTask myTask=new MyTask();
        Thread thread=new Thread(myTask);
        thread.setName("worker 0");
        thread.start();
    }
}
