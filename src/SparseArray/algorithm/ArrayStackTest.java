package SparseArray.algorithm;

import SparseArray.entity.ArrayStack;
import org.junit.Test;

/**
 * @author 爽
 * 栈测试
 */
public class ArrayStackTest {


    @Test
    public void testPushAndPop(){

        ArrayStack arrayStack=new ArrayStack(10);
        /**
         * 入栈
         */
        for (int i = 9; i >=0; i--) {
            arrayStack.push(i);
        }


        /**
         * 出栈
         */
        for (int i = 10; i >=0; i--) {
            System.out.println("出栈元素："+arrayStack.pop());
        }
    }
}
