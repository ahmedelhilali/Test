package recursion;
import queue.Node;


public class RecursiveLinkedList {
    protected Node head = null;

    public static void main(String[] args) {
        RecursiveLinkedList  r = new RecursiveLinkedList();
        r.traverse(r.head);
        System.out.println(r.count(r.head));
    }

    public RecursiveLinkedList() {
        // for this example, just manually add
        Node c = new Node("C", null);
        Node b = new Node("B", c);
        Node a = new Node("A", b);
        head = a;
    }

    public void traverse(Node currentNode) {
        // this is a recursive traversal
        if (currentNode == null) {
            // base case: do nothing
        }
        else {
            System.out.println(currentNode.getPayload());
            traverse(currentNode.getNext());
        }
    }

    public int count (Node currentNode) {
        int counter;
        if (currentNode == null) {
            // base case
            counter = 0;
        }
        else {
            counter = 1 + count(currentNode.getNext());
        }
        return counter;
    }
}
