import java.util.*;

public class p2_queue_prog {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(21);
        q.add(13);
        q.add(45);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}