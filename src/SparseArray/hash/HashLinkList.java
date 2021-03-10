package SparseArray.hash;

/**
 * hash 链表
 *
 * @author 爽
 */
public class HashLinkList {

    /**
     * 头结点
     */
    private Emp head=null;


    /**
     * 添加节点
     */
    public void add(Emp emp){
        if (head==null){
            head=emp;
            return;
        }
        Emp headTemp=head;
        while (headTemp.next!=null){
            headTemp=headTemp.next;
        }
        headTemp.next=emp;
    }

    /**
     * 遍历链表
     */
    public void list(){
        if (head==null){
            System.out.println("当前链表为空");
            return;
        }
        Emp headTemp=head;
        while (headTemp!=null){
            System.out.println(headTemp.toString());
            headTemp=headTemp.next;
        }
    }

    /**
     * 查找节点
     * @param id
     * @return
     */
    public Emp get(int id){
        if (head==null){
            return null;
        }
        Emp headTemp=head;
        Emp node=null;
        while (headTemp!=null){
            if (headTemp.getId().equals(id)){
                node=headTemp;
                break;
            }
            headTemp=head.next;
        }
        return node;
    }



}
