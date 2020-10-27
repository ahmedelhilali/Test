package queue;

public class Queue {
    Node head = null;
    Node tail = null;

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.append("A");
        queue.append("B");
        queue.append("C");

        queue.iterate();
        System.out.println();

        Node node = queue.pop();
        System.out.println(node.getPayload());
        System.out.println();

        queue.append("D");
        queue.iterate();
    }

    public Queue() {
        head = null;
        tail = null;
    }

    public void append(String value) {
        // add new node to end of stack
        // if queue is empty, this is the head

        Node node = new Node(value, null);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }
    }

    public Node pop() {
        // pop the head of the stack
        Node node = null;
        // return null if empty stack

        if (head != null) {
            node = head;
            head = node.getNext();
        }
        return node;
    }

    public void iterate() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getPayload());
            currentNode = currentNode.getNext();
        }
    }
}
