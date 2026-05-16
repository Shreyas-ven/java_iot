import java.util.*;

public class p1_minHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);

        System.out.println(minHeap.peek());
        minHeap.poll();
        System.out.println(minHeap.peek());
    }
}
