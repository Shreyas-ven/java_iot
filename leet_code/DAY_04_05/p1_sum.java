class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class p1_sum {

   
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

    public static void main(String[] args) {
        

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(20);

        int sum = sumOfNodes(root);
        System.out.println("Sum of all nodes: " + sum);
    }
}