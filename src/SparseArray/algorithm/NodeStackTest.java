package SparseArray.algorithm;

import SparseArray.entity.NodeStack;
import SparseArray.node.SingleNode;
import org.junit.Test;

/**
 * @author 爽
 * 链表实现栈
 */
public class NodeStackTest {

    @Test
    public void test01(){
        NodeStack nodeStack=new NodeStack();
        for (int i = 1; i <= 9; i++) {
            SingleNode singleNode=new SingleNode(i);
            nodeStack.push(singleNode);
        }
        nodeStack.list();

        for (int i = 1; i <= 9; i++) {
            nodeStack.pop();
        }

        nodeStack.list();
    }
}
