package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentAppProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/StudentAppMCA";
        String user = "root";
        String password = "Shreyas@7154";
        try{
            Connection con = DriverManager.getConnection(url,user,password);
            while(true){
                System.out.print("Select Any Operation: \n1) Insert \n2) View \n3) Update \n4) Delete \n5) Exit \nYour choice:");
                int choice = sc.nextInt();

                if(choice == 1){

                    System.out.println("Enter USN:");
                    int usn=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name:");
                    String name=sc.nextLine();


                    System.out.println("Enter Marks:");
                    int marks = sc.nextInt();

                    String query = "INSERT INTO students VALUES (?,?,?)";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1,usn);
                    ps.setString(2,name);
                    ps.setInt(3,marks);

                    ps.executeUpdate();
                    System.out.println("Data Inserted Successfully!");
                    ps.close();

                }else if(choice == 2){

                    String query = "SELECT * FROM students;";
                    PreparedStatement ps = con.prepareStatement(query);

                    ResultSet rs = ps.executeQuery(query);

                    while(rs.next()){
                        System.out.println(rs.getInt("usn") + "  " + rs.getString("name") + "  " +  rs.getInt("marks")  );
                    }

                }else if(choice == 3){
                    System.out.println("Enter choice to update the details : \n1.Name \n2.Marks");
                    int choice_update=sc.nextInt();

                    if(choice_update == 1){

                        System.out.println("Enter the USN to update:");
                        int usn = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter the name to update:");
                        String name = sc.nextLine();

                        String query = "UPDATE students SET name = '" + name + "' WHERE usn = " + usn;
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.executeUpdate();
                        System.out.println("Name Updated Successfully!");
                    }

                    else if(choice_update == 2){

                        System.out.println("Enter the USN to update:");
                        int usn = sc.nextInt();

                        System.out.println("Enter the marks to update:");
                        int marks = sc.nextInt();

                        String query = "UPDATE students SET marks = " + marks + " WHERE usn = " + usn;
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.executeUpdate();
                        System.out.println("Marks Updated Successfully!");
                    }

                    else{
                        System.out.println("Invalid Choice!");
                    }


                }else if(choice == 4){
                    System.out.println("Enter the USN you want to delete: ");
                    int usn = sc.nextInt();
                    String query="DELETE FROM students where usn=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setInt(1,usn);
                    ps.executeUpdate();
                    System.out.println("Deleted successfully");

                }else if(choice == 5){
                    break;
                }else{
                    System.out.println("Invalid Input");
                }
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!"+e);
        }
    }
}
