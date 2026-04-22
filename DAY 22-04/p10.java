import java.util.Scanner;

class student {
    private int marks;

    public void putMarks(int m) {
        if (m > 0 && m <= 100) { 
            marks = m;
        } else {
            System.out.println("Invalid marks! Enter between 1 and 100.");
        }
    }

    public int getMarks() {
        return marks;
    }
}

public class p10 {
    public static void main(String[] args) {
        
        int user_marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks:");
        user_marks = sc.nextInt();

        student s = new student();
        s.putMarks(user_marks);

        
        System.out.println("Marks entered: " + s.getMarks());
    }
}