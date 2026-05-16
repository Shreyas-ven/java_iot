import java.util.*;

public class p5_hash_set {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10);

        for(int m:hs){
            System.out.println(m);
        }
    }
}
