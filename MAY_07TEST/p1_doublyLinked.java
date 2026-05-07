
import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

class p1_doublyLinked {

    static Node head = null;

    // Insert at front (as required)
    static void insertFront(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        head = newNode;
    }

    // Remove duplicates
    static void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;

        while (current != null) {
            if (set.contains(current.data)) {

                // delete node
                Node prevNode = current.prev;
                Node nextNode = current.next;

                if (prevNode != null)
                    prevNode.next = nextNode;
                else
                    head = nextNode;

                if (nextNode != null)
                    nextNode.prev = prevNode;

            } else {
                set.add(current.data);
            }
            current = current.next;
        }
    }

    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            insertFront(sc.nextInt());
        }

        removeDuplicates();
        printList();
    }
}