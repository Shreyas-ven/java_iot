
import java.util.*;

public class p1_multiple_data {
    public static void main(String []args ){
        ArrayList<Integer> List =new ArrayList<>();
        LinkedList<Integer> LL = new LinkedList<>();

        HashSet<Integer> Hs=new HashSet<>();
        TreeSet<Integer> Ts =new TreeSet<>();

        HashMap<Integer,String> Hm = new HashMap<>();

        TreeMap<Integer,String> Tm =new TreeMap();


        //List
        List.add(0,2);
        List.add(1,98);
        List.add(2,89);
        List.add(3,69);

        System.out.println("List Items :");
         for (int i:List ){
            System.out.print(i);
        }

        //Linked List
        System.out.println("Linked list Items :");
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

        System.out.println("Hash Set :");
        for (int i:Hs){
            System.out.println(i);
        }


        //Tree Set 

        Ts.add(85);
        Ts.add(90);
        Ts.add(78);
        Ts.add(90); //duplicate ignored
        Ts.add(88);

        System.out.println("Tree set :");
        System.out.println("Sorted marks :" + Ts );

        System.out.println("Lowest marks :" + Ts.first());

        System.out.println("Highest marks :" + Ts.last());

        System.out.println("Above 80:"+ Ts.tailSet(80));

        System.out.println("Below 80 :" + Ts.headSet(60));


        //HashMap
        Hm.put(101,"Shreyas");
        Hm.put(102,"Subba");
        Hm.put(102,"Subbi");
        Hm.put(103,"Sharan");
        Hm.put(104,"Nithin");

        System.out.println("HashMap :");
        System.out.println(Hm.get(102));
        System.out.println(Hm.values());



        //TreeMap
        Tm.put(101,"Chaitanya");
        Tm.put(102,"Paul");
        Tm.put(103,"Logan");
        Tm.put(103,"Derick");

        Set set=Tm.entrySet();
        

    }
    
}
