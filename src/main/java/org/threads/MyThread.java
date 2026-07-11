package org.threads;

public class MyThread extends Thread{

    // NEW → RUNNABLE → RUNNING → WAITING → TERMINATED.
    public void run(){
        System.out.println("MyThread is running");
    }

    public void aVoid(){
        System.out.println("MyThread is running");
    }

}
