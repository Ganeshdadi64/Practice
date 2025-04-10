package com.scaler.ThreadsAndSync.ProducerConsumerMutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Lock lock = new ReentrantLock();


        Producer p1 = new Producer(objects, 6, "p1", lock);
        Producer p2 = new Producer(objects, 6, "p2", lock);
        Producer p3 = new Producer(objects, 6, "p3", lock);

        Consumer c1 = new Consumer(objects, 6, "c1", lock);
        Consumer c2 = new Consumer(objects, 6, "c2", lock);
        Consumer c3 = new Consumer(objects, 6, "c3", lock);
        Consumer c4 = new Consumer(objects, 6, "c4", lock);
        Consumer c5 = new Consumer(objects, 6, "c5", lock);


        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.start();

        Thread t4 = new Thread(c1);
        t4.start();
        Thread t5 = new Thread(c2);
        t5.start();
        Thread t6 = new Thread(c3);
        t6.start();
        Thread t7 = new Thread(c4);
        t7.start();
        Thread t8 = new Thread(c5);
        t8.start();
    }
}
