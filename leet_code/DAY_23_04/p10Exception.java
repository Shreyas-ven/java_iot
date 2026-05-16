public class p10Exception {
    public static void main(String args[]){
        int a =10;
        int b=10;
        double s=0;

        try{
            s=a/b;
            System.out.println(s);
        }catch(ArithmeticException e){
            System.out.println("Exception Handled : Divide by zero not possible");
        }
    }
}
