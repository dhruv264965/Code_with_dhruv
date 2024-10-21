package MultiThreading.Practics;

import java.util.Scanner;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("hello"+Thread.currentThread());
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
    }
}
