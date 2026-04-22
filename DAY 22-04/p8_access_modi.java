public class p8_access_modi {
    public static void main(String [] args){
        int a=20;
        double m=Math.pow(a,2);
        System.out.println(m);
        c1 ob=new c1();
        ob.info();
    } 
}

class c1{
    private String Name="Raj";
    protected void info(){
        System.out.println(Name);
    }
}
