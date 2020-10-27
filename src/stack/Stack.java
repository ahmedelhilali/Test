package stack;

import java.nio.file.attribute.UserPrincipalLookupService;

public class Stack {
    private Node head;

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(new Node("A", null));
        stack.push(new Node("B", null));
        stack.push(new Node("C", null));

        System.out.println("Initial stack is 'upside down'");

        stack.iterate();

        System.out.println("Invert by copying to a new stack");
        Stack invert = new Stack();
        while (stack.isEmpty() == false) {
            invert.push(stack.pop());
        }

        System.out.println("\n Stack: ");
        stack.iterate();

        System.out.println("\n Invert: ");
        invert.iterate();

        System.out.println("Copy back to original");
        stack = invert;
        System.out.println("\n Stack: ");
        stack.iterate();

        System.out.println("\n Finding B");
        Node b = stack.search("B");
        System.out.println(b.getPayload());
        System.out.println("\n ... and the stack has not changed");
        stack.iterate();
    }

    public Stack() {
        head = null;
    } // end constructor

    public void push(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }

    public Node pop() {
        Node topNode = head;
        head = topNode.getNext();
        return topNode;
    }

    public boolean hasNext() {
        boolean result = true;
        if (head.getNext() == null) {
            result = false;
        }
        return result;
    }

    public boolean isEmpty() {
        boolean result = false;
        if (head == null) {
            result = true;
        }
        return result;
    }

    public Node search (String target) {
        Stack stack = new Stack();
        Node currentNode = this.pop();
        stack.push(currentNode);
        boolean keepGoing = true;
        Node result = null;
        while (keepGoing) {
            if (target.equals(currentNode.getPayload())) {
                result = currentNode;
                keepGoing = false;
            }
            currentNode = this.pop();
            if (this.head == null) {
                keepGoing = false;
            }
            else {
                stack.push(currentNode);
            }
        }

        // so now we have stack, currentNode, and this.
        // put them all back together
        this.push(currentNode);
        while (stack.isEmpty() == false) {
            this.push(stack.pop());
        }
        return result;
    }

    public void iterate() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getPayload());
            current = current.getNext();
        }
    }
}
