package trees;

public class Tree {
    protected BinaryNode head;

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.buildSample();

        System.out.println("Inorder traversal: ");
        tree.inOrder(tree.head);

        System.out.println("Preorder traversal: ");
        tree.preOrder(tree.head);

        System.out.println("Postorder traversal: ");
        tree.postOrder(tree.head);
    }

    public Tree() {
        head = null;
    }

    public void buildSample() {
        BinaryNode node1 = new BinaryNode("1", null, null);
        BinaryNode node3 = new BinaryNode("3", null, null);
        BinaryNode node2 = new BinaryNode("2", node1, node3);
        BinaryNode node5 = new BinaryNode("5", null, null);
        BinaryNode node7 = new BinaryNode("7", null, null);
        BinaryNode node6 = new BinaryNode("6", node5, node7);
        BinaryNode node4 = new BinaryNode("4", node2, node6);
        head = node4;
    }


    public void inOrder(BinaryNode currentNode) {
        if (currentNode == null) {
            // base case: do nothing
        }
        else {
            inOrder(currentNode.getLeft());
            System.out.println(currentNode.getPayload());
            inOrder(currentNode.getRight());
        }
    }

    public void preOrder(BinaryNode currentNode) {
        if (currentNode == null) {
            // base case: do nothing
        }
        else {
            System.out.println(currentNode.getPayload());
            preOrder(currentNode.getLeft());
            preOrder(currentNode.getRight());
        }
    }

    public void postOrder(BinaryNode currentNode) {
        if (currentNode == null) {
            // base case: do nothing
        }
        else {
            postOrder(currentNode.getLeft());
            postOrder(currentNode.getRight());
            System.out.println(currentNode.getPayload());
        }
    }
}
