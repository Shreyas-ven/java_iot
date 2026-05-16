import java.util.Scanner;

public class p4_binary_search {

public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;  
            }
            else if (arr[mid] < target) {
                low = mid + 1;   
            }
            else {
                high = mid - 1;  
            }
        }
        return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11}; 
        int target;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the search element :");
        target=sc.nextInt();

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}