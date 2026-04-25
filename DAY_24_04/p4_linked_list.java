import java.util.LinkedList;

public class p4_linked_list {
    public static void main (String [] args){
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(10);
        LL.add(24);
        LL.add(22);

        for (Integer s:LL){
            System.out.println(s);
        }

        System.out.println("Fist Data :" + LL.getFirst());
        System.out.println("Last Data :" + LL.getLast());

    }
}
