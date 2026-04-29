import java.util.Scanner;

public class p2_reverse_array {
    
    static void reverse(int arr[], int n) {
        if (n == 0)
            return;

        System.out.print(arr[n - 1] + " ");
        reverse(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array is:");
        reverse(arr, n);
    }
}