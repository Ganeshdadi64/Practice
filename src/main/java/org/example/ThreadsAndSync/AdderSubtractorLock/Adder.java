package org.example.ThreadsAndSync.AdderSubtractorLock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Count count;
    Lock lock;

    Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 1000; i++) {
//            lock.lock();
            //Critical Section
            count.value += i;
            System.out.println(Thread.currentThread().getName()+" "+count.value );
//            lock.unlock();
        }
        lock.unlock();
    }
}
