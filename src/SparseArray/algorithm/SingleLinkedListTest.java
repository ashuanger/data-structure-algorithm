package SparseArray.algorithm;

import SparseArray.entity.HeroNode;
import SparseArray.entity.SingleLinkedList;
import org.junit.Test;

/**
 * @author 爽
 * 单项链表测试类
 */
public class SingleLinkedListTest {


    public static void main(String[] args) {
        SingleLinkedListTest singleLinkedListTest=new SingleLinkedListTest();
        System.out.println("===========顺序添加节点==========");
        SingleLinkedList singleLinkedList=singleLinkedListTest.testAddNodeByOrder();
        System.out.println("===========修改节点==========");
        singleLinkedListTest.testEditNodeInfo(singleLinkedList);
        System.out.println("===========删除节点==========");
        singleLinkedListTest.testDeleteNode(singleLinkedList);
    }

    /**
     * 表尾添加节点
     */
    @Test
    public void testAddNode(){
        //创建节点
        HeroNode heroNode1=new HeroNode(1,"nt1","sb1");
        HeroNode heroNode2=new HeroNode(2,"nt2","sb2");
        HeroNode heroNode3=new HeroNode(3,"nt3","sb3");
        HeroNode heroNode4=new HeroNode(4,"nt4","sb4");
        //创建链表
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.addNode(heroNode1);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNode(heroNode3);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNode(heroNode4);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNode(heroNode2);
        singleLinkedList.list();
        System.out.println("=======================");
    }

    /**
     * 按照顺序添加节点
     */
    @Test
    public SingleLinkedList testAddNodeByOrder(){
        //创建节点
        HeroNode heroNode1=new HeroNode(1,"nt1","sb1");
        HeroNode heroNode2=new HeroNode(2,"nt2","sb2");
        HeroNode heroNode3=new HeroNode(3,"nt3","sb3");
        HeroNode heroNode4=new HeroNode(4,"nt4","sb4");
        //创建链表
        SingleLinkedList singleLinkedList=new SingleLinkedList();
        singleLinkedList.addNodeByOrder(heroNode1);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNodeByOrder(heroNode3);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNodeByOrder(heroNode4);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNodeByOrder(heroNode2);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.addNodeByOrder(heroNode2);
        singleLinkedList.addNodeByOrder(heroNode3);
        return singleLinkedList;
    }

    /**
     * 修改链表节点
     */
    @Test
    public void testEditNodeInfo(SingleLinkedList singleLinkedList){
        HeroNode heroNode1=new HeroNode(1,"nt11","sb11");
        HeroNode heroNode2=new HeroNode(2,"nt22","sb22");
        HeroNode heroNode3=new HeroNode(3,"nt33","sb33");
        HeroNode heroNode4=new HeroNode(4,"nt44","sb44");
        HeroNode heroNode5=new HeroNode(5,"nt55","sb5");
        singleLinkedList.editNodeInfo(heroNode2);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.editNodeInfo(heroNode4);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.editNodeInfo(heroNode5);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.editNodeInfo(heroNode1);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.editNodeInfo(heroNode3);
        singleLinkedList.list();
        System.out.println("=======================");
    }

    /**
     * 删除节点链表
     * @param singleLinkedList
     */
    public void testDeleteNode(SingleLinkedList singleLinkedList){
        HeroNode heroNode1=new HeroNode(1,"nt11","sb11");
        HeroNode heroNode2=new HeroNode(2,"nt22","sb22");
        HeroNode heroNode3=new HeroNode(3,"nt33","sb33");
        HeroNode heroNode4=new HeroNode(4,"nt44","sb44");
        HeroNode heroNode5=new HeroNode(5,"nt55","sb5");

        singleLinkedList.deleteNode(heroNode2);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.deleteNode(heroNode4);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.deleteNode(heroNode5);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.deleteNode(heroNode1);
        singleLinkedList.list();
        System.out.println("=======================");
        singleLinkedList.deleteNode(heroNode3);
        singleLinkedList.list();
        System.out.println("=======================");

    }


}
