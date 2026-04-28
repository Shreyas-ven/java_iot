class Node {
    private int Data;
    private Node Next;

    public Node(int data) {
        Data = data;
    }

    public int getData() {
        return Data;
    }

    public void setData(int data) {
        Data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node next) {
        Next = next;
    }
}



public class p2_linkedList {

    public static void main(String[] args) {

        Node ten = new Node(10);
        Node twenty = new Node(20);
        Node thirty = new Node(30);

        Node home = ten;

        home.setNext(twenty);
        twenty.setNext(thirty);

        printAll(home);
    }

    public static void printAll(Node home) {
        Node curr = home;

        while(curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}