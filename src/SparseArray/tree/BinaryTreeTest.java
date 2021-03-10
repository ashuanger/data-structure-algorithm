package SparseArray.tree;

/**
 * @author 爽
 */
public class BinaryTreeTest {

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        TreeNode node3=new TreeNode(4);
        TreeNode node4=new TreeNode(5);
//        TreeNode node5=new TreeNode(6);
//        TreeNode node6=new TreeNode(7);
//        TreeNode node7=new TreeNode(8);
//        TreeNode node8=new TreeNode(9);

        root.setLeftChild(node1);
        root.setRightChild(node2);

        node2.setRightChild(node3);
        node2.setLeftChild(node4);
//
//        node2.setLeftChild(node5);
//        node2.setRightChild(node6);
//
//        node3.setLeftChild(node7);
//        node3.setRightChild(node8);

        BinaryTree.binaryTreePrologue(root);
        System.out.println("");
        BinaryTree.binaryTreeMiddle(root);
        System.out.println("");
        BinaryTree.binaryTreePost(root);
        System.out.println("");
        TreeNode findTreeNode=BinaryTree.treeMiddleSearch(root,5);
        if (findTreeNode==null){
            System.out.println("节点为空");
        }else {
            System.out.println(findTreeNode.toString());
        }

    }
}
