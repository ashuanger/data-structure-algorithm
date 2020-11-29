package SparseArray.algorithm;

import SparseArray.entity.CircleSingleLinkedList;
import org.junit.Test;

/**
 * @author 爽
 * 验证环形链表
 */
public class CircleSingleLinkedListTest {


    @Test
    public void test01(){
        CircleSingleLinkedList circleSingleLinkedList=new CircleSingleLinkedList(9);
        circleSingleLinkedList.list();
    }

    /**
     * 约瑟夫环
     */
    @Test
    public void josefCircle(){
        CircleSingleLinkedList circleSingleLinkedList=new CircleSingleLinkedList(5);
        int[] array=circleSingleLinkedList.josefCircle(5);
        for (int i:
             array) {
            System.out.println(i);
        }
    }
}
