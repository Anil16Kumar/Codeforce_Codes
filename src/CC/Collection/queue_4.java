package CC.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_4 {
    public static void main(String[] args) {
        //A data structure that works on the
        //FIFO (First-In-First-Out) principle
        //------------------------QUEUE-----------------

        //------LinkedList implementation---------
        Queue<Integer> que=new LinkedList<>();
        que.add(12);
        que.add(22);
        que.add(10);
        que.add(98);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());

        //------------PriorityQueue implementation---------
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //// part of the Queue interface
        //// orders elements based on their natural ordering (for primitives lowest first)
        pq.add(12);
        pq.add(3);
        pq.add(44);
        pq.add(54);
        pq.add(90);
        System.out.println(pq);
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)


    }
}
