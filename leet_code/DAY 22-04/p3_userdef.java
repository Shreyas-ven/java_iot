import java.util.Scanner;
public class p3_userdef{
    public static void main(){
        Scanner sc =new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter the first name:");
        firstName=sc.nextLine();

        System.out.println("Enter the last name:");
        lastName=sc.nextLine();

        surNameDisplay(firstName,lastName);

            
    }
    static void surNameDisplay(String f, String l){
        String fullName = f + l;
        System.out.println("Your full name is : "+ " " + fullName);

    }
}