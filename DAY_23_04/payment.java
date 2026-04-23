import java.util.Scanner;

public class payment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose payment method:");
            System.out.println("1. UPI");
            System.out.println("2. Card");
            System.out.println("3. Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("UPI payment successful!");
                        break;
                    case 2:
                        System.out.println("Card payment successful!");
                        break;
                    case 3:
                        System.out.println("Cash payment successful!");
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } else {
                System.out.println("Please enter a valid number!");
                sc.next(); // clear wrong input
                choice = 0; // keep loop running
            }

        } while (choice != 4);

        sc.close();
    }
}