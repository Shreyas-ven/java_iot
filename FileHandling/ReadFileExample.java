package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("Students.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
