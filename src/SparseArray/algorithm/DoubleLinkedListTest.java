package SparseArray.algorithm;


import SparseArray.entity.DoubleLinkedList;
import SparseArray.node.DoubleNode;

/**
 * @author 爽
 * 双向链表测试
 */
public class DoubleLinkedListTest {

    public static void main(String[] args){
        DoubleLinkedListTest doubleLinkedListTest=new DoubleLinkedListTest();
        DoubleLinkedList doubleLinkedList=new DoubleLinkedList();
        DoubleNode doubleNode1=new DoubleNode(1);
        DoubleNode doubleNode2=new DoubleNode(2);
        DoubleNode doubleNode3=new DoubleNode(3);
        DoubleNode doubleNode4=new DoubleNode(4);
        DoubleNode doubleNode5=new DoubleNode(5);
        DoubleNode doubleNode6=new DoubleNode(6);

        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode1);
        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode6);
        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode5);
        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode4);
        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode3);
        doubleLinkedListTest.addNode(doubleLinkedList,doubleNode2);

        doubleLinkedListTest.listDoubleLinkedList(doubleLinkedList);
    }


    /**
     * 遍历测试
     * @param doubleLinkedList
     */
    public void listDoubleLinkedList(DoubleLinkedList doubleLinkedList){
        System.out.println("=================遍历链表=======================");
        doubleLinkedList.list();
    }

    /**
     * 添加节点
     * @param doubleLinkedList
     * @param doubleNode
     */
    public void addNode(DoubleLinkedList doubleLinkedList, DoubleNode doubleNode){
        System.out.println("=================添加节点====================");
        doubleLinkedList.addNode(doubleNode);
    }

    public void deleteNode(DoubleLinkedList doubleLinkedList,DoubleNode doubleNode){
        System.out.println("==================删除节点==================");
        doubleLinkedList.deleteNode(doubleNode);
    }
}
