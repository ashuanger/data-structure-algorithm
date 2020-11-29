package SparseArray.node;

/**
 * @author 爽
 * 双向链表节点
 */
public class DoubleNode {

    /**
     * 节点编号
     */
    public int no;


    /**
     * 指向下一个节点
     */
    public DoubleNode next;

    /**
     * 指向前一个节点
     */
    public DoubleNode pre;

    public DoubleNode(int no) {
        this.no = no;
    }
}
