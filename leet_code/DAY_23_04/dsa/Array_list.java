import java.util.*;

public class Array_list {
    public static void main(String[] args) {

        ArrayList<Integer> ListArray = new ArrayList<>();

        ListArray.add(10);
        ListArray.add(25);
        ListArray.add(55);
        System.out.println(ListArray);

        for (int num:ListArray){
            System.out.println(num);
        }
    }
}