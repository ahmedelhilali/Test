package stack;

public class Node {
    private String payload;
    private Node next;

    public Node() {
        payload = "";
        next = null;
    } // end constructor

    public Node(String payload, Node next) {
        this.payload = payload;
        this.next = next;
    } // end constructor

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
