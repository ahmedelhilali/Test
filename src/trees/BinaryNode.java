package trees;

public class BinaryNode {
    protected String payload;
    protected BinaryNode left;
    protected BinaryNode right;

    public BinaryNode() {
        //set nulls
        payload = "";
        left = null;
        right = null;
    }

    public BinaryNode(String payload, BinaryNode left, BinaryNode right) {
        this.payload = payload;
        this.left = left;
        this.right = right;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
