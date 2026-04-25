
import java.util.*;

public class p1 {
    public static void main(String []args ){
        ArrayList<Integer> List =new ArrayList<>();
        LinkedList<Integer> LL = new LinkedList<>();
        HashSet<Integer> Hs=new HashSet<>();

        //List
        List.add(0,2);
        List.add(1,98);
        List.add(2,89);
        List.add(3,69);

         for (int i:List ){
            System.out.println(i);
        }

        //Linked List
        LL.add(0,2);

        for (int i:LL){
            System.out.println(i);
        }

        //Sets -->Does not take duplicate
        //maps

        Hs.add(2);
        Hs.add(45);
        Hs.add(13);
        Hs.add(18);
        Hs.add(2);

        for (int i:Hs){
            System.out.println(i);
        }

        
    }
    
}
