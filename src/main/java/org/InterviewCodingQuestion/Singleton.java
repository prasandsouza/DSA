package org.InterviewCodingQuestion;

public class Singleton {

    // volatile ensures visibility across all threads and
    // prevents instruction reordering
    private static  volatile Singleton instance;

    private Singleton() {
    }

    private static  Singleton getSingleton(){
        if(instance==null){                        // 1st check without lock
            synchronized (Singleton.class){
                if(instance==null){                // 2nd check with lock
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // why double check?
    // first null check avoids unnecessary synchronization overhead
    // Second null check inside syncronized block ensures that
    // only one instance is created even when multiple threads access the method simultaneously.
}
