import java.util.Scanner;

public class P6_switch{
    public static void main (String [] args ){
        System.out.println("Welcome to flipcart ! \n Select your choice \n 1.Add to cart \n 2.Purchase product \n  3.Delete product");
        Scanner sc = new Scanner (System.in);
        int a=0;
        a=sc.nextInt();

        switch (a){
            case(1):{
                System .out.println("Added to cart");
                break;
            }
            case(2):{
                System.out.println("Product purchased !");
                break;
            }
            case(3):{
                System.out.println("Deleted product !!");
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }

    }
}