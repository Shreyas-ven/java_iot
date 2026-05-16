import java.util.Stack;

public class p3_stack {
    public static void main(){
        Stack<Integer> S1 = new Stack<>();
        for(int i=0; i<10; i++){
            S1.push(i);
        }

        System.out.println();
         System.out.println("The stack is Empty : " +  S1.isEmpty());

        for (int i =0; i<10; i++){
            int s=S1.pop();
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("The stack is Empty : " + S1.isEmpty());
    }
}
