class car{
    int milage;
    String color;
    int model;

    car(int mi,String co, int mod){
        milage=mi;
        color=co;
        model=mod;
    }

    void startCar(){
        System.out.println("Press Start Button");
        System.out.println("Car Started !");
    }

    void stopCar(){
        System.out.println("Turn off the key");
        System.out.println("Car Stopped !");
    }

}

public class p9_oops {
    public static void main(String [] args){
        car obj =new car(15,"Black",2015);
        System.out.println("The car milage: " + obj.milage + "color: "+ obj.color + "model :" +obj.model );

        obj.startCar();
        obj.stopCar();
    }
    
}
