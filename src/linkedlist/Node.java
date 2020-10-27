package linkedlist;

public class Node {
    String payload;
    Node next;
    public Node() {
        payload = "";
        next = null;
    }

    public Node(String payload, Node next) {
        this.payload = payload;
        this.next = next;
    }

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
