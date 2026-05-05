
import java.util.Collections;
import java.util.PriorityQueue;

public class p2_maxHeap {
    public static void main(String[] args){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int[] arr ={12,3,2,15,18,22,35,32};

        for(int i : arr){
            maxHeap.add(i);
        }
        System.out.println(maxHeap.peek());
    }
}
