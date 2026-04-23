import java.io.*;

public class p11Exception {
    public static void main(String args[]){
        try{
            FileReader fr =new FileReader("file.txt");
            System.out.println("File found !!");
        }catch(Exception e){
            System.out.println("File not found");
        }finally{
            System.out.println("Checked for file in this root");
        }
    }
}
