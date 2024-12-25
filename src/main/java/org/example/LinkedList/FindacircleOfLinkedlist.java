package org.example.LinkedList;

import java.util.HashSet;

public class FindacircleOfLinkedlist {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList(1);
        
        ll.next=new LinkedList(2);
        ll.next.next=new LinkedList(3);
        ll.next.next.next=new LinkedList(4);
        ll.next.next.next.next=new LinkedList(5);
        ll.next.next.next.next.next=new LinkedList(6);
         ll.next.next.next.next.next.next = ll; // Make the linked list circular
         LinkedList cycleStart = findCycleStart(ll);

         if (cycleStart != null) {
             System.out.println("Cycle starts at node with value: " + cycleStart.data);
         } else {
             System.out.println("No cycle found.");
         }

    }

//detect the cycle
private static LinkedList hasCycle(LinkedList ll) {
    LinkedList slow = ll;
    LinkedList fast = ll;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return slow; // Return the meeting point
        }
    }
    return null;
}

//find the starting point of the cycle
private static LinkedList findCycleStart(LinkedList head) {
    LinkedList meetingPoint = hasCycle(head);
    if (meetingPoint == null) return null; // No cycle

    LinkedList start = head;
    while (start != meetingPoint) {
        start = start.next;
        meetingPoint = meetingPoint.next;
    }
    return start;
}

}
