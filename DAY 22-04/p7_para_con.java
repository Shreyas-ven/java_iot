class Student{
    String name;
    Student(String nm){
        this.name=nm;
    }

    void display(){
        System.out.println("Using method:" + name);
    }

}

public class p7_para_con{
    public static void main(String [] args){
        Student s1=new Student("John");
        System.out.println("Using object accessing" +  s1.name);
        s1.display();
    }
}