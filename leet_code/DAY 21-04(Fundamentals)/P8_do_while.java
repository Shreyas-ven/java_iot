import java.util.Scanner;

public class P8_do_while{
    public static void main(String [] args){
        int pin=1234;
     int enteredPin;
     Scanner sc=new Scanner(System.in);
     
     int attempts=0;
     do {
        System.out.println("Enter pin : ");
        enteredPin=sc.nextInt();
        if (enteredPin == pin){
            System.out.println("Login Successful!!");
            break;
        }
        else {
            attempts +=1;
            System.out.println("Wrong key, try Again!");
        }
     }while (attempts <3);

     if (attempts>=3){
        System.out.println("Account Blocked");
     }
    }
}