package SparseArray.entity;

/**
 * @author 爽
 * 单链表
 */
public class SingleLinkedList {
    /**
     * 先初始化头节点,不存放任何数
     */
    private HeroNode headNode=new HeroNode(0,"","");

    /**
     * 添加节点到单项链表
     * 思路：当不考虑编号顺序时
     * 1.找到当前链表的最后节点
     * 2.将最后这个节点的next指向新的节点，新的节点next为null
     */
    public void addNode(HeroNode heroNode){
        //需要一个头节点副本遍历temp
        HeroNode headNodeTemp=headNode;
        //遍历链表，找到最后一个节点
        while (true){
            if (headNodeTemp.next==null){
                break;
            }
            //如果不是最后一个节点，往后移
            headNodeTemp=headNodeTemp.next;
        }
        headNodeTemp.next=heroNode;
    }

    /**
     * 按照顺序添加节点
     * 1.找到添加节点的位置，找节点的前一个节点temp
     * 2.新节点的next等于temp.next
     * 3.temp.next=新的节点
     * 如果重复了就提示错误
     */
    public void addNodeByOrder(HeroNode heroNode){
        //先取到头节点的副本temp
        HeroNode headNodeTemp=headNode;
        //判断新加入的节点是否重复了，默认false
        boolean flag=false;
        //遍历链表
        while (true){
            //默认从第一个开始都比新的节点小，直到找到比添加的节点大的节点为止.遍历到最后一个，退出循环
            if (headNodeTemp.next==null||headNodeTemp.next.no>heroNode.no){
                heroNode.next=headNodeTemp.next;
                headNodeTemp.next=heroNode;
                break;
            }
            //如果有重复的，就退出循环
            if (headNodeTemp.next.no==heroNode.no){
                System.out.println("节点:"+heroNode.no+"已经存在");
                break;
            }
            //往后移
            headNodeTemp=headNodeTemp.next;
        }
    }


    /**
     * 遍历链表
     */
    public void list(){
        //先判断链表是否为空
        if (headNode.next==null){
            return;
        }
        //需要一个头节点副本遍历temp
        HeroNode temp=headNode.next;
        while (true){
            if (temp==null){
                break;
            }
            //输出节点信息
            System.out.println(temp.toString());
            //节点后移
            temp=temp.next;
        }
    }
}