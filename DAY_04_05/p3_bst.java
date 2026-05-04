class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class p3_bst {

    Node root;

    // INSERT
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // SEARCH
    public boolean search(Node root, int key) {
        if (root == null) return false;

        if (key == root.data) return true;
        else if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    // FIND MIN (used in delete)
    public int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // DELETE
    public Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Two children
            int minValue = findMin(root.right);
            root.data = minValue;
            root.right = delete(root.right, minValue);
        }

        return root;
    }

    // INORDER (sorted output)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        p3_bst tree = new p3_bst();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int v : values) {
            tree.root = tree.insert(tree.root, v);
        }

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(tree.root, 40));

        tree.root = tree.delete(tree.root, 30);

        System.out.print("After deleting 30: ");
        tree.inorder(tree.root);
    }
}