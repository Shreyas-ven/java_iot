import java.util.Scanner;

public class p2_user_input{
	public static void main(String [] args){
		int user_input;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number : ");
		user_input =sc.nextInt();
		System.out.println("The entered number is " + user_input);
	}

}