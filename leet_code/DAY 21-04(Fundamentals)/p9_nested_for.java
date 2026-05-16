import java.util.Scanner;

public class p9_nested_for {
    public static void main(String[] args) {
        // triangle formation using nested for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        //for loop with break
        for (int i=0; i<10; i++){
            if (i==a){
                System.out.println("Condition satisfied !");
                break;
            }
            System.out.println("Iteration :" + i);
        }
    }
}