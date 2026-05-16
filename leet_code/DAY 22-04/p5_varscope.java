public class p5_varscope {
    int a=10;
    static int b=20;

    public static void main(String [] args){
        //System.out.println(a); // -->cannot access 
        System.out.println(b);
    }
    
}
