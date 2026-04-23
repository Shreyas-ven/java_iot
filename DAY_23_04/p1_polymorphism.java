class Bank{
    void display(){
        System.out.println("General interest");
    }
}

class Canara extends Bank{
    void display(){
        System.out.println("8% of interest");
    }
}


public class p1_polymorphism {
 public static void main(String [] args)   {

    Bank obj=new Canara();
    obj.display();
 }
}
