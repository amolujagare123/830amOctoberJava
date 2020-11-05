package CollectionDemos.QueueDemos;

import java.util.PriorityQueue;

public class QueueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(13);
        pq.offer(3);
        pq.offer(31);
        pq.offer(113);

        System.out.println(pq);

        // [ 3, 13, 23, 31, 113 ]

        // some operting systems /compliers doest not support priority queue
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
