class Node1 {
    int data;
    Node1 left, right;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node1 root;

    // Inorder Traversal
    void inOrder(Node1 node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Preorder Traversal
    void preOrder(Node1 node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Postorder Traversal
    void postOrder(Node1 node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}

public class p4_treeTraversal {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.root = new Node1(12);
        tree.root.left = new Node1(21);
        tree.root.right = new Node1(8);
        tree.root.left.left = new Node1(22);
        tree.root.left.right = new Node1(1);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(3);

        System.out.println("Inorder Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\nPreorder Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postOrder(tree.root);
    }
}