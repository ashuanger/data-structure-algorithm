package SparseArray.tree;

/**
 * @author 爽
 */
public class ArrayBinaryTreeTest {

    public static void main(String[] args) {
        ArrayBinaryTreeNode arrayBinaryTreeNode=
                new ArrayBinaryTreeNode(new int []{1,2,3,4,5,6,7});
        ArrayBinaryTree.arrBinaryTreePrologue(arrayBinaryTreeNode.getArray(),0);
        System.out.println("");
        ArrayBinaryTree.arrBinaryTreeMiddle(arrayBinaryTreeNode.getArray(),0);
        System.out.println("");
        ArrayBinaryTree.arrBinaryTreePost(arrayBinaryTreeNode.getArray(),0);

    }
}
