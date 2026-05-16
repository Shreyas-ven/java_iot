import java.util.Scanner;

public class p2_RotatedArraySearch {

    static int search(int arr[], int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            // Left half sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Right half sorted
            else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {5, 7, 9, 3, 4};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int ans = search(arr, target);

        if (ans != -1)
            System.out.println("Found at index: " + ans);
        else
            System.out.println("Not Found");
    }
}