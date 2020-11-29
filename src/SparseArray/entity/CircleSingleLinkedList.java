package SparseArray.entity;

import SparseArray.node.SingleNode;

/**
 * @author 爽
 * 环形单向链表
 */
public class CircleSingleLinkedList {

    /**
     * 第一个节点
     */
    private SingleNode first;

    /**
     * 最后一个节点
     */
    private SingleNode last;

    /**
     * 节点数量
     */
    private int size=0;

    /**
     * 初始化
     * @param size
     */
    public CircleSingleLinkedList(int size) {
        if (size<=0){
            throw new RuntimeException("初始化失败，输入的size不准确");
        }
        for (int i = 1; i <= size ; i++) {
            SingleNode node=new SingleNode(i);
            if (i==1){
                first=node;
                last=node;
                last.setNext(first);
                this.size=1;
            }else{
                last.setNext(node);
                node.setNext(first);
                last=node;
                this.size++;
            }
        }
    }

    /**
     * 遍历环形链表
     */
    public void list(){
        if (size==0){
            System.out.println("链表为空");
        }
        SingleNode temp=first;

        do {
            System.out.println(temp.toString());
            temp=temp.getNext();
        }while (temp!=first);
    }


    /**
     * 约瑟夫环
     * @return
     */
    public int[] josefCircle(int k){
        if (k<=0){
            throw new RuntimeException("参数不合法");
        }
        int[] array=new int[size];
        int index=0;
        SingleNode temp=last;
        while (size>0){
           //如果刚好整除，就是刚好一个循环,last节点出站
            if (k%size==0){
                for (int i=1;i<=size-1;i++){
                    temp=temp.getNext();
                }
            }else {
                for (int i=1;i<=(k%size)-1;i++){
                    temp=temp.getNext();
                }
            }
            array[index]=temp.getNext().getVal();
            index++;
            size--;
            temp.setNext(temp.getNext().getNext());
       }
       return array;
    }


}
