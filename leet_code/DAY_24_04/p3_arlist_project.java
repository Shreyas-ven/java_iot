/*
1. Array List
2. Adding Student Details
3. View the Student Details

*/
import java.util.Scanner;
import java.util.ArrayList;

class Student{
    private int Reg_no;
    private String Name;
    private String Branch;
    
    public int getReg_no() {
        return Reg_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    Student(int reg, String name, String br){
        this.Reg_no = reg;
        this.Name = name;
        this.Branch = br;
    }

    public void display(){
        System.out.println("\nReg No: " + Reg_no +" Name: "+ Name +  " Branch: " + Branch + "\n");
    }
}

class Student_MS{ 

    ArrayList<Student> Student_list = new ArrayList<>();
    // Need to Add Students to the List Array
    public void Add_new_member(Student s){
        Student_list.add(s);
        System.out.println("Added the menber Successfully!");
    }

    // Need to Display/View All the Data present in Array

    public void view_all_Data(){
        if(Student_list.isEmpty() == true){
            System.out.println("No Data Found! Add new members to view");
        }
        else{
            for(Student s:Student_list){
                 s.display();
            }
        }
    }

    // Search by Reagistration No.

    public void Search_by_reg(){

    }

    // Update Details.

}

public class p3_arlist_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student_MS service = new Student_MS();
        while(true){
            System.out.println("Enter the number to perform forllowing Operations!");
            System.out.println("1. Add the Student Details!");
            System.out.println("2. View All the Students Details!");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1: { // Add the Student Details
                            System.out.println("Enter your Reg No.:");
                            int reg_no = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Enter your Full Name:");
                            String Name = sc.nextLine();
                            System.out.println("Enter your Branch:");
                            String Branch = sc.nextLine();
                            Student st = new Student(reg_no, Name, Branch);
                            service.Add_new_member(st);
                            break;
                        }
                case 2: // Display all the Details
                        {   System.out.println("Student Details!");
                            service.view_all_Data();
                            break;
                        }
                case 3: {System.out.println("Quit Operation initiated, you will exit soon!");
                        return;
                    }

                default: break;
            }

        }
    }
}
