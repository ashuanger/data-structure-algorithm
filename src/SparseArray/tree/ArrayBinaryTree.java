package SparseArray.tree;

/**
 * 顺序存储二叉树
 *
 * @author 爽
 */
public class ArrayBinaryTree {


    /**
     * 前序遍历存储二叉树
     * @param array
     * @param index
     */
    public static void arrBinaryTreeMiddle(int [] array,int index){
        if (array==null || array.length <= 0){
            System.out.println("遍历失败，数组为空");
        }
        //遍历左子节点
        int leftNode= index*2 + 1;
        if (leftNode<array.length){
            arrBinaryTreeMiddle(array,leftNode);
        }
        //输出当前节点
        System.out.print(array[index]);
        System.out.print("->");

        //遍历右子节点
        int rightNode= index*2 + 2;
        if (rightNode<array.length){
            arrBinaryTreeMiddle(array,rightNode);
        }
    }


    /**
     * 中序遍历存储二叉树
     * @param array
     * @param index
     */
    public static void arrBinaryTreePrologue(int [] array,int index){
        if (array==null || array.length <= 0){
            System.out.println("遍历失败，数组为空");
        }
        //输出当前节点
        System.out.print(array[index]);
        System.out.print("->");
        //遍历左子节点
        int leftNode= index*2 + 1;
        if (leftNode<array.length){
            arrBinaryTreePrologue(array,leftNode);
        }
        //遍历右子节点
        int rightNode= index*2 + 2;
        if (rightNode<array.length){
            arrBinaryTreePrologue(array,rightNode);
        }
    }

    /**
     * 后序遍历存储二叉树
     * @param array
     * @param index
     */
    public static void arrBinaryTreePost(int [] array,int index){
        if (array==null || array.length <= 0){
            System.out.println("遍历失败，数组为空");
        }
        //遍历左子节点
        int leftNode= index*2 + 1;
        if (leftNode<array.length){
            arrBinaryTreePost(array,leftNode);
        }
        //遍历右子节点
        int rightNode= index*2 + 2;
        if (rightNode<array.length){
            arrBinaryTreePost(array,rightNode);
        }
        //输出当前节点
        System.out.print(array[index]);
        System.out.print("->");
    }

}
