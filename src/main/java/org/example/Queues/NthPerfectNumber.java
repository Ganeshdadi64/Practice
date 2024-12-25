package org.example.Queues;

import java.util.*;

public class NthPerfectNumber {
    public static void main(String[] args) {

        //Nth perfect number
//        Queue<Integer> q= new LinkedList<>();
//        int n=3;
//        q.add(1);
//        q.add(2);
//        int count=2;
//        int k=1;
//        for(int i=0;i<n;i++) {
//
//            int num = q.poll();
//            if(k==n) System.out.println(num);
//            q.add(num * 10 + 1);
//            q.add((num*10+2));
//
//        }
//        System.out.println(q.peek());
//=======================================================================================

        // Queue usisng stack

        Queue<Integer> q1= new LinkedList<>();
        Queue<Integer> hp= new LinkedList<>();

        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);

//        void remove(){
//            while ((q1.size()>0)){
//                hp.add(q1.remove());
//            }
//            System.out.println(q1.peek());
//
//
//            while ((hp.size()>=0)){
//                q1.add(hp.remove());
//            }
//        }


    }



}
