package org.example.ThreadsAndSync.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
    Lock lock;

    Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 1000; i++) {
//            lock.lock();
            count.value -= i;
            System.out.println(Thread.currentThread().getName()+" "+count.value );
//            lock.unlock();
        }
        lock.unlock();
    }
}
