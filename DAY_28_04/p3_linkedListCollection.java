import java.util.Iterator;
import java.util.LinkedList;

public class p3_linkedListCollection {
    public static void main(String []args){
        LinkedList<Integer> List = new LinkedList<>();

        List.add(10);
        List.add(20);
        List.add(30);

        Iterator<Integer> it = List.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    }
}
