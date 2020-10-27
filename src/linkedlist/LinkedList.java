package linkedlist;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append("A");
        linkedList.append("B");
        linkedList.append("C");

        linkedList.traverse();

        Node b = linkedList.search("B");
        System.out.println(b + ": " + b.getPayload());

        linkedList.insertAfter("B", "T");
        linkedList.traverse();

        linkedList.insertAfter("J", "K");

        linkedList.deleteNode("T");

        linkedList.traverse();

    }

    public LinkedList() {
        head = null;
    } // end constructor

    public void append(String value) {
        // append this value to the end of the list
        Node currentNode = null;
        // if list is empty, just make the node the new head
        if (head == null) {
            head = new Node(value, null);
        }
        else {
            // if there are already nodes, go to the end
            currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            // now the current node is the last node
            // add a new node
            currentNode.setNext(new Node(value, null));
        }
    }

    public void traverse() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getPayload());
            currentNode = currentNode.getNext();
        }
    }

    public Node search (String value) {
        /*
            return a node containing a string
            or null if the string is not found
         */

        Node result = null;
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getPayload().equals(value)) {
                result = currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return result;
    }

    public void insertAfter(String prevString, String value) {
        Node before = search(prevString);
        if (before == null) {
            System.out.println(prevString + " not found...");
        }
        else {
            Node after = before.getNext();
            Node newNode = new Node(value, after);
            before.setNext(newNode);
        }
    }

    public void deleteNode(String value) {
        // chech to see that node is there

        if (search(value) == null) {
            System.out.println("That node is not here");
        }
        else {
            // special search preseves previous element
            Node currentNode = head;
            Node preNode = head;
            String currentValue;

            while (currentNode != null) {
                currentValue = currentNode.getPayload();
                if (currentValue.equals(value)) {
                    // delete this element
                    Node nextNode = currentNode.getNext();
                    preNode.setNext(nextNode);
                    // note we don't actually delete anything
                }

                // move on to next node
                preNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
    }




}
