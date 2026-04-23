class string_mutable_alternatives{
    public void alter(){
        StringBuilder sc= new StringBuilder();
        sc.append("Hello World");
        sc.append("Good day!");
        System.out.println (sc);
    }
}



public class p7_String {
    public static void main(String [] args){
        String msg ="Good Day !";
        String m = new String("Good Day !");

        System.out.println(msg + m );
        //Object and variable comparision too 
        System.out.println(msg == m);
        //Only data comparision
        System.out.println(m.equals(msg));


        String s="Hello";
        String concated = s.concat("World !");
        System.out.println(s.length());

        System.out.println("Concatenated :" + concated);
        System.out.println("Substring :" + s.substring(0,4));
        System.out.println("Uppercase :" + s.toUpperCase());
        System.out.println("Lowercase : " + s.toLowerCase());
        

        string_mutable_alternatives obj = new string_mutable_alternatives();
        obj.alter();

    }
}
