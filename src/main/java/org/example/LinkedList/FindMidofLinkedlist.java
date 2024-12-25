package org.example.LinkedList;

public class FindMidofLinkedlist {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList(1);
        ll.next=new LinkedList(2);
        ll.next.next=new LinkedList(3);
        ll.next.next.next=new LinkedList(4);
        ll.next.next.next.next=new LinkedList(5);
        ll.next.next.next.next.next=new LinkedList(6);
        int midval=findMid(ll);
    }

    private static int findMid(LinkedList ll) {
        LinkedList slow=ll;
        LinkedList fast=ll;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

}
