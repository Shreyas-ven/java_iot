public class p1_summationProject {

    public static void main(String[] args) {

        int arr[] = {10, 2, 3, 4, 8, 12};
        int k = 3;
        int n = arr.length;

        int sum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Window 1 Sum = " + sum);

        // Sliding window
        for (int i = 1; i <= n - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            System.out.println("Window " + (i + 1) + " Sum = " + sum);

        }
    }
    
}
