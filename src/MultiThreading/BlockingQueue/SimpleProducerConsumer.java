package MultiThreading.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SimpleProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<String>queue=new ArrayBlockingQueue<>(3);
        Runnable producer= ()->{
          int i=0;
          while (true){
              String msg="message "+i;
              try {
                  queue.put(msg);
                  System.out.println(" producer "+ msg);
                  i++;
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        Runnable consumer=()->{
          while (true){
              try {
                  String msg= queue.take();
                  System.out.println(" consumer "+msg);
                  Thread.sleep(1500);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
//We use an ArrayBlockingQueue with size 3 to store messages.
//The producer thread puts new messages every second.
//The consumer takes them and prints after a delay.
//If the queue is full, the producer waits.
//If the queue is empty, the consumer waits.
//This automatic blocking/waiting is the key benefit of BlockingQueue.
