
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.FileWriter;

public class AppendFileExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Students.txt",true);
            writer.write("\nNew Line Added!");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
