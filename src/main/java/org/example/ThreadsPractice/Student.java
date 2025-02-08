package org.example.ThreadsPractice;

public class Student extends Thread{


    SharedResource sharedResource;

    public Student(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }


    public void run(){
        sharedResource.printNumber();
    }

    public static void main(String[] args) throws InterruptedException {

         SharedResource sh=new SharedResource();

         Thread t1= new Student(sh);
         Thread t2=new Student(sh);

         t1.start();
         t1.join();
         t2.start();

         t2.join();


    }


}
