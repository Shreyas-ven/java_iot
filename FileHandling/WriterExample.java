package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterExample {
    public static void main(String[] args) {

        try {
            //create the filewriter object
            FileWriter writer = new FileWriter("Students.txt");

            //write the contents of the file
            writer.write("Hello Students \n Welcome to my class");

            writer.close();
        } catch(IOException e){
            System.out.println(e);
        }

    }
}
