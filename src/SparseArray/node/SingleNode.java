package SparseArray.node;

/**
 * @author 爽
 * 单向节点
 */
public class SingleNode {

    /**
     * 值
     */
    private int val;

    /**
     * 指向下一个节点
     */
    private SingleNode next;

    public SingleNode() {

    }

    public SingleNode(int val) {
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "val=" + val +
                '}';
    }
}
