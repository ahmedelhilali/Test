package doublelinkedlist;

public class Node {

    private String payload;
    private Node previous;
    private Node next;

    public Node() {
        this.payload = "";
        this.previous = null;
        this.next = null;
    }

    public Node(String payload, Node previous, Node next) {
        this.payload = payload;
        this.previous = previous;
        this.next = next;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
