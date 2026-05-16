import java.util.Iterator;
import java.util.LinkedList;
//Problem : 1)Create Singly linked list - with 5 elements and doubly linked list 2) Add 1 value to start node 3) add 1 value to start and end of node 
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
