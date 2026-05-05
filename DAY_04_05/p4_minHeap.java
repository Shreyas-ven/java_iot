import java.util.PriorityQueue;

public class p4_minHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(20);
        minHeap.add(2);

        // Peek (smallest element)
        System.out.println("Min element: " + minHeap.peek());

        // Remove elements
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}