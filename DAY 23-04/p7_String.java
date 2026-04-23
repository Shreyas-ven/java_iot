public class p7_String {
    public static void main(String [] args){
        String msg ="Good Day !";
        String m = new String("Good Day !");

        System.out.println(msg + m );
        //Object and variable comparision too 
        System.out.println(msg == m);
        //Only data comparision
        System.out.println(m.equals(msg));
    }
}
