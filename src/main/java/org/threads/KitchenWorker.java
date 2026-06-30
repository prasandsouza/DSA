package org.threads;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KitchenWorker  implements  Runnable{
    String message;

    @Override
    public void run() {
        System.out.println(message + " is starting work.");
        try {
            // Simulate work with sleep
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(message + " was interrupted.");
        }
        System.out.println(message + " has finished work.");
    }


}
