package com.scaler.ThreadsAndSync.ThreadExecutorExample;

public class PrintNumbers implements Runnable{
    int numberToPrint;
    PrintNumbers(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + " Thread: " + Thread.currentThread().getName());
    }
}
