abstract class StartEngine{
    void start(){
        System.out.println("Engine started succesful !");
    }
}

class KeyInput extends StartEngine{
    void key_insertion(){
    System.out.println("Key Inserted ");
    }
}

public class p5_abstratct {
    public static void main(String args[]){
        KeyInput ki =new KeyInput();
        ki.key_insertion();
        ki.start();
    }
}


