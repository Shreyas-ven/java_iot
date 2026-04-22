public class p2_builtmath{
    public static void main(){
            System.out.println("This is main Function");
            builtin(9,18);
            
    }
    static void builtin(int a, int b){
        double square=Math.sqrt(a);
        double max=Math.max(a,b);
        double min=Math.min(a,b);
        double power=Math.pow(a,b);
        System.out.println("Square of a:" + square);
        System.out.println("Maximum of a,b:" + max);
        System.out.println("Minimum of a,b:" + min);
        System.out.println("Power of a, b: " + power);

    }
}