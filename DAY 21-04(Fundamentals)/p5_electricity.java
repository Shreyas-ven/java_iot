import java.util.Scanner;

public class p5_electricity {
    public static void main(String[] args) {

        int units;
        double bill = 0;
        double surcharge = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid input. Units cannot be negative.");
            return;
        }

        if (units <= 100) {
            bill = units * 1.5 ;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5  ;
        } else if (units <= 300) {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4 ;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 4 + (units - 300) * 6 ;
        }

        // Surcharge
        if (bill > 1000) {
            surcharge = bill * 0.15;
            bill = bill + surcharge;
            System.out.println("Surcharge: " + surcharge);
        }

        System.out.println("Total Electricity Bill: " + bill);

        sc.close();
    }
}