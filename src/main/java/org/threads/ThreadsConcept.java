package org.threads;

public class ThreadsConcept {

    public static void main(String[] args) {

        // Creating a platform thread
        Thread platformThread = new Thread(() -> {
            System.out.println("This is a platform thread."+ Thread.currentThread().getName());
        });
        platformThread.start();

        // Creating a virtual thread (Java 19+)
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("This is a virtual thread." +Thread.currentThread().getName());
        });

        try {
            platformThread.join();
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
