package SparseArray.tree;

/**
 * @author 爽
 */
public class TreeNode {

    private int key;

    private String value;

    private TreeNode leftChild;

    private TreeNode rightChild;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode(int key) {
        this.key = key;
        this.value=Integer.toString(key);
    }

    public TreeNode() {
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
