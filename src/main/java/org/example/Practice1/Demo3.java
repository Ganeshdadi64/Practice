package org.example.Practice1;

public class Demo3 {
    public static void main(String[] args) {

        try{
            System.out.println("hi");
        }finally {
            notify();
            System.out.println("bye");
        }
    }

    }
void notify(){
    System.out.println("hello");

}
