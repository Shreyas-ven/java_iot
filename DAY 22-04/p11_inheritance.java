class animal {
    void Sleep(){
        System.out.println("Sleeping!");
    }

    void Eat(){
        System.out.println("Eating!");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("Dog always Bark !");
    }
}





public class p11_inheritance {
    public static void main(String[] args){
        dog d=new dog();
        d.bark();
        d.Eat();
        d.Sleep();
    }
    
}
