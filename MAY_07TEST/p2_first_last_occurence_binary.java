
import java.util.*;

class p2_first_last_occurence_binary {

    static int firstOccurrence(int[] arr, int low, int high, int x) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            int left = firstOccurrence(arr, low, mid - 1, x);
            return (left == -1) ? mid : left;
        }
        else if (arr[mid] > x) {
            return firstOccurrence(arr, low, mid - 1, x);
        }
        else {
            return firstOccurrence(arr, mid + 1, high, x);
        }
    }

    static int lastOccurrence(int[] arr, int low, int high, int x) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            int right = lastOccurrence(arr, mid + 1, high, x);
            return (right == -1) ? mid : right;
        }
        else if (arr[mid] > x) {
            return lastOccurrence(arr, low, mid - 1, x);
        }
        else {
            return lastOccurrence(arr, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int first = firstOccurrence(arr, 0, n - 1, x);

        if (first == -1) {
            System.out.println("NO OCCURRENCES");
        } else {
            int last = lastOccurrence(arr, 0, n - 1, x);
            System.out.println(first + " " + last);
        }
    }
}