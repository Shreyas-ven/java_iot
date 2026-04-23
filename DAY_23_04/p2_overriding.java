class overriding{
    void add(int a, int b){
        int sum= a+b;
        System.out.println("The sum is: " + sum);
    }

    void add(double a, double b){
        double sum= a+b;
        System.out.println("The sum is: " + sum);
    }

    void add(int a,int b, int c){
        int sum=a +b+ c;
        System.out.println("The sum is :" + sum);
    }

    void add(String a, String b){
        String s=a+b;
        System.out.printf("Concatenated string : %s", s);
    }
}



public class p2_overriding {
    public static void main(String [] args){
        overriding or=new overriding();
        or.add(10,20);
        or.add(1.2,1.4);
        or.add(10,20,30);
        or.add("Shreyas","V");

    }
}
