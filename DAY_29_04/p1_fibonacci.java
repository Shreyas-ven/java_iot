import java.util.Scanner;

public class p1_fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}