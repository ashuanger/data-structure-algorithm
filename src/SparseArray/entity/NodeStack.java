package SparseArray.entity;

import SparseArray.node.SingleNode;

/**
 * @author 爽
 * 链表栈实体类
 */
public class NodeStack {


    /**
     * 数量
     */
    private int size;

    /**
     * 栈顶
     */
    private SingleNode top;

    /**
     * 栈底
     */
    private SingleNode button;



    /**
     * 初始化栈
     */
    public NodeStack( ) {
        SingleNode node=new SingleNode();
        this.size = 0;
        this.top = node;
        this.button=node;
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty(){
        return this.top==this.button;
    }

    /**
     * 进栈
     */
    public void push(SingleNode node){
        System.out.println("入栈元素："+node.getVal());
        size++;
        node.setNext(top);
        top=node;
    }

    /**
     * 出栈
     * @return
     */
    public SingleNode pop(){
        if (isEmpty()){
            throw new RuntimeException("出栈失败,栈为空");
        }
        SingleNode popNode=top;
        top=top.getNext();
        size--;
        return popNode;
    }


    /**
     * 遍历栈
     */
    public void list(){
        if (isEmpty()){
            throw new RuntimeException("遍历失败,栈为空");
        }
        SingleNode temp=this.top;
        while (temp!=button){
            System.out.println("遍历栈："+temp.getVal());
            temp=temp.getNext();
        }
    }

}
