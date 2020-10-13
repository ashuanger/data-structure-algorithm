package SparseArray.algorithm;

import SparseArray.entity.HeroNode;
import SparseArray.entity.SingleLinkedList;
import org.junit.Test;

/**
 * @author 爽
 * 单项链表测试类
 */
public class SingleLinkedListTest {


    @Test
    public void test(){
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
}
