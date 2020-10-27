package doublelinkedlist;

public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("C");


        linkedList.iterate();
        System.out.println();

        Node result = linkedList.search("B");
        System.out.println(result.getPayload());
        System.out.println();

        linkedList.insertAfter("B", "T");
        System.out.println();
        linkedList.iterate();

        System.out.println();
        linkedList.delete("T");
        linkedList.iterate();
    }

    public LinkedList() {
        head = null;
    } // end constructor

    public void append(String newValue) {
        // adds new value to end of list
        Node newNode = new Node(newValue, null, null);
        // move to end of list
        Node currentNode = head;
        // if we have an empty list, the new element is the head
        if (currentNode == null) {
            head = newNode;
        }
        else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            } // end while: by end,current Node should be last
            currentNode.setNext(newNode);
            newNode.setPrevious(currentNode);
        }
    }

    public void iterate() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getPayload());
            currentNode = currentNode.getNext();
        }
    }

    public Node search(String target) {
        Node currentNode = head;
        Node result = null;

        while (currentNode != null) {
            if (currentNode.getPayload().equals(target)) {
                result = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return result;
    }

    public void insertAfter(String target, String value) {
        Node before = this.search(target);
        if (before == null) {
            System.out.println("Target not found");
        }
        else {
            Node after = before.getNext();
            Node newNode = new Node(value, before, after);
            before.setNext(newNode);
            after.setPrevious(newNode);
        }
    }

    public void delete(String target) {
        Node targetNode = this.search(target);
        if (targetNode == null) {
            System.out.println("Target not found");
        }
        else {
            Node before = targetNode.getPrevious();
            Node after = targetNode.getNext();
            before.setNext(after);
            after.setPrevious(before);
            // target node will be deleted bw garbage collector
        }
    }


}
