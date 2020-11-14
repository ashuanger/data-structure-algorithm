package SparseArray.entity;

/**
 * @author 爽
 * 双向链表
 */
public class DoubleLinkedList {

    private DoubleNode headNode=new DoubleNode(0);

    public DoubleNode getHeadNode() {
        return headNode;
    }


    /**
     * 遍历双向链表
     */
    public void list(){
        //判断链表是否为空
        if (headNode.next==null){
            System.out.println("链表为空");
            return;
        }
        //需要一个副本指向头结点
        DoubleNode headNodeTemp=headNode.next;
        while (true){
            //判断是否链表最后
            if (headNodeTemp==null){
                break;
            }
            //输出节点信息
            System.out.println(headNodeTemp.no);
            headNodeTemp=headNodeTemp.next;
        }
    }

    /**
     * 正常添加双向链表的节点
     * @param doubleNode
     */
    public void addNode(DoubleNode doubleNode){
        //需要一个头节点副本遍历temp
        DoubleNode headNodeTemp=headNode;
        while (true){
            if (headNodeTemp.next==null){
                break;
            }
            headNodeTemp=headNodeTemp.next;
        }
        //最后一个节点的下一个节点指向加入的节点
        headNodeTemp.next=doubleNode;
        //加入的节点指向最后一个节点
        doubleNode.pre=headNodeTemp;
    }


    /**
     * 删除双向链表的节点
     * @param doubleNode
     */
    public void deleteNode(DoubleNode doubleNode){
        //头节点副本
        DoubleNode headNodeTemp=headNode.next;
        //用来判断是否有找到删除的节点
        boolean flag=false;
        while (true){
            //退出循环
            if (headNodeTemp==null){
                break;
            }
            if (headNodeTemp.no==doubleNode.no){
                //找到需要删除的节点
                headNodeTemp.pre.next=headNodeTemp.next;
                //如果是最后一个节点，则不需要执行下面的步骤
                if (headNodeTemp.next!=null){
                    headNodeTemp.next.pre=headNodeTemp.pre;
                }
                flag=true;
                break;
            }
            headNodeTemp=headNodeTemp.next;
        }
        if (!flag){
            System.out.println("删除节点失败");
        }else {
            System.out.println("删除节点成功");
        }
    }
}
