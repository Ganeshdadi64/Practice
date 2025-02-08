package org.example.ThreadsPractice;

public class SharedResource {

   synchronized  public void printNumber(){
        for(int i=0;i<500;i++){

            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

}
