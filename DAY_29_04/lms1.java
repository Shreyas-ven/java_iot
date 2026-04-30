import java.util.Scanner;
import java.util.Arrays;

public class lms1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Convert string to char array
        char[] arr = input.toCharArray();

        // Sort characters
        Arrays.sort(arr);

        // Print sorted string
        System.out.println(new String(arr));

    }
}