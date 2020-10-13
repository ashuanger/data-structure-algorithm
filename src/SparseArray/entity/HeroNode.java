package SparseArray.entity;

/**
 * @author 爽
 * 单链表节点
 */
public class HeroNode {

    /**
     * 节点编号
     */
    public int no;
    public String name;
    public String nickName;
    /**
     * 指向下个节点
     */
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
