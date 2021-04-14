package SparseArray.tree;

/**
 * 测试二叉平衡树
 *
 * @author 爽
 */
public class AvlTreeTest {

    public static void main(String[] args) {
        int [] array={10,11,7,6,8,9};
        TreeNode headNode=new TreeNode(array[0]);
        for (int i = 1; i <array.length ; i++) {
            AvlTree.addNode(new TreeNode(array[i]),headNode);
        }
        System.out.println("");
        System.out.println(TreeUtil.getHeight(headNode));
        System.out.println(TreeUtil.getLeftNodeHeight(headNode));
        System.out.println(TreeUtil.getRightNodeHeight(headNode));
        System.out.println(headNode.toString());
        BinaryTree.binaryTreeMiddle(headNode);
        System.out.println("");
        System.out.println(TreeUtil.getHeight(headNode));
        System.out.println(TreeUtil.getLeftNodeHeight(headNode));
        System.out.println(TreeUtil.getRightNodeHeight(headNode));
        System.out.println(headNode.toString());
    }
}
