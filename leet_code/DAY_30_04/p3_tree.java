class Node {
    int Data;
    Node left;
    Node right;

    Node(int data) {
        this.Data = data;
        this.left = null;
        this.right = null;
    }
}

public class p3_tree {

    public static void main(String[] args) {

        Node root = new Node(12);

        root.left = new Node(21);
        root.right = new Node(22);

        System.out.println(root.Data + " " + root.left.Data + " " + root.right.Data);
    }
}