package org.threads;

public class MultiThread {
    // create  a code to understand thread concept in java


    public static void main(String[] args) {
        System.out.println("=== Main Program Starts (Main Thread) ===");

        // 2. Create the tasks
        KitchenWorker chefTask = new KitchenWorker("Chef Alex");
        KitchenWorker cleanerTask = new KitchenWorker("Cleaner Bob");

        // 3. Create the actual Thread objects and pass the tasks to them
        Thread thread1 = new Thread(chefTask);
        Thread thread2 = new Thread(cleanerTask);

        // 4. Start the threads!
        // CRITICAL: Call .start(), NOT .run().
        // .start() tells the JVM to allocate a new CPU thread.
        thread1.start();
        thread2.start();

        System.out.println("=== Main Thread finishes setting up the workers! ===");
    }
}
