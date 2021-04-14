package SparseArray.tree;

/**
 * @author 爽
 */
public class BinarySortTreeTest {

    public static void main(String[] args) {
        int [] array={7,3,10,12,5,1,9,22,31,8,9,11,21,45,25,6};
        TreeNode headNode=new TreeNode(array[0]);
        for (int i = 1; i <array.length ; i++) {
            BinarySortTree.addNode(new TreeNode(array[i]),headNode);
        }
        BinaryTree.binaryTreeMiddle(headNode);
        System.out.println("");
        TreeNode searchNode=BinarySortTree.search(6,headNode);
        if (searchNode != null){
            System.out.println(searchNode.toString());
        }else {
            System.out.println("查找为空");
        }
        TreeNode searchPatientNode=BinarySortTree.searchParent(7,headNode);
        if (searchPatientNode != null){
            System.out.println(searchPatientNode.toString());
        }else {
            System.out.println("查找为空");
        }
        BinarySortTree.deleteNode(22,headNode);
        System.out.println("");
        BinaryTree.binaryTreeMiddle(headNode);
        System.out.println("");
        System.out.println(TreeUtil.getHeight(headNode));
        System.out.println(TreeUtil.getLeftNodeHeight(headNode));
        System.out.println(TreeUtil.getRightNodeHeight(headNode));
    }
}
