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
     * 修改节点信息
     * 1.根据节点的no来进行修改
     * 2.先判断链表是否为空
     * 3.遍历链表，找到该节点，如果找不到，给出提示信息
     * 4.直接修改该节点的信息
     */
    public void editNodeInfo(HeroNode heroNode){
        //1.先判断链表是否为空
        if (headNode.next==null){
            System.out.println("修改失败，链表为空");
            return;
        }
        //判断是否能找到该节点
        boolean flag=false;
        //需要一个头节点副本遍历temp
        HeroNode headNodeTemp=headNode;
        while (true){
            if (headNodeTemp.next==null){
                break;
            }
            if (headNodeTemp.next.no==heroNode.no){
                flag=true;
                heroNode.next=headNodeTemp.next.next;
                headNodeTemp.next=heroNode;
                break;
            }
            headNodeTemp=headNodeTemp.next;
        }
        if (!flag){
            System.out.println("修改失败，节点"+heroNode.no+"不存在");
        }

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
     * 删除节点
     * 1.先找到删除的节点的上一个节点
     * 2.上一个节点的next指向被删除节点的next
     * 3.如果没找到的话就提示错误
     */
    public void deleteNode(HeroNode heroNode){
        //先使用头节点的副本
        HeroNode headNodeTemp=headNode;
        //用来判断是否有找到删除的节点
        boolean flag=false;
        //遍历链表
        while (true){
            if (headNodeTemp.next==null){
                break;
            }
            if (headNodeTemp.next.no==heroNode.no){
                //直接指向后一个节点，被删除的节点被断开
                headNodeTemp.next=headNodeTemp.next.next;
                flag=true;
                break;
            }
            headNodeTemp=headNodeTemp.next;
        }
        //判断是否删除了
        if (!flag){
            System.out.println("删除失败，节点"+heroNode.no+"不存在");
        }
    }

    /**
     * 查询单链表节点个数
     * @return
     */
    public int getListNodeNum(){
        //节点个数
        int num=0;
        //先判断链表是否为空
        if (headNode.next==null){
            return num;
        }
        //需要头结点
        HeroNode temp=headNode.next;
        while (true){
            if (temp==null){
                break;
            }
            num++;
            //节点后移
            temp=temp.next;
        }
        return num;
    }


    /**
     * 查询单链表倒数第k个结点
     * 1.遍历节点，计算出单链表的个数count
     * 2.从头结点开始循环，循环次数（count-k）
     * @return
     */
    public HeroNode getHeadNodeByIndex(int k){
        if (headNode.next==null){
            return null;
        }
        int count = getListNodeNum();
        //判断k是否合法
        if (k<=0 || k>count){
            return null;
        }
        HeroNode headNodeTemp=headNode;
        for (int i = 0; i <= count-k; i++) {
            headNodeTemp=headNodeTemp.next;
        }
        return headNodeTemp;
    }

    /**
     * 反转链表
     * 1.新建立一个临时头结点
     * 2.遍历链表
     * 3.每次遍历一个结点，将这个节点移除到新的头结点的下一个节点
     * 4.遍历完之后将头结点指向临时头结点的下一个节点
     */
    public void reverseLinkedList(){
        if (headNode.next==null||headNode.next.next==null){
            return;
        }

        //1.临时头节点
        HeroNode newNode=new HeroNode();
        //辅助节点
        HeroNode cur=headNode.next;
        //next节点
        HeroNode next=null;
        //2.遍历链表
        while (cur!=null){
            next=cur.next;
            cur.next=newNode.next;
            newNode.next=cur;
            cur=next;
        }
        headNode.next=newNode.next;
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

    /**
     * 逆序打印：递归打印
     */
    public void printReverse(HeroNode head){
        //需要一个头结点副本来遍历
        while (true){
            if(head==null){
                break;
            }else {
                printReverse(head.next);
                System.out.println(head.toString());
                break;
            }
        }
    }

    public HeroNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(HeroNode headNode) {
        this.headNode = headNode;
    }
}