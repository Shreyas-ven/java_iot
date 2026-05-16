import java.util.Scanner;

public class p3_calculator {
    public static void main(String[] args) {
        int num1, num2;
		String name;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
		
		System.out.println("Enter who is calculating : ");
		sc.nextLine();
        name = sc.nextLine();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;

        
        if (num2 != 0) {
            int div = num1 / num2;

            System.out.printf(
                "The calculated values are:\nAddition: %d\nSubtraction: %d\nMultiplication: %d\nDivision: %d",
                add, sub, mul, div
            );
        } else {
            System.out.printf(
                "The calculated values are:\nAddition: %d\nSubtraction: %d\nMultiplication: %d\nDivision: Not possible (division by zero)",
                add, sub, mul
            );
        }
		
		System.out.printf("\n %s calculated successfully !!", name);

        sc.close(); 
    }
}