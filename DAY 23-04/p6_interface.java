interface IT_company{
    public void softwareDevelopment();
    public void Hiring();
    
}

class Tech implements IT_company{

    public void softwareDevelopment(){
        System.out.println("Hello Developer");
    }

    public void Hiring(){
        System.out.println("We are hiring");
    }   
}

public class p6_interface {
    public static void main(String [] args){
        Tech t=new Tech();
        t.softwareDevelopment();
        t.Hiring();
    }
}
