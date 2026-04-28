import java.util.ArrayList;

public class p2_arrayList {
    public static void main(String [] args){
        ArrayList<Integer> List =new ArrayList<>(10);
        List.add(100);
        List.add(210);
        List.add(340);
        List.add(19);
        List.add(310);

        for(int i:List){
            System.out.print(i + " ");
        }
        List.add(1,42000);

        System.out.println("");

        System.out.println("After modification");
        for(int i:List){
            System.out.print(i + " ");
        }

        
    }
}
