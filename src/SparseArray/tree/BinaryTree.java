package SparseArray.tree;

/**
 * 遍历树
 *
 * @author 爽
 */
public class BinaryTree {


    /**
     * 前序遍历
     * @param treeNode
     */
    public static void binaryTreePrologue(TreeNode treeNode){
        //前序遍历顺序：父节点 -> 左节点 -> 右节点
        System.out.print(treeNode.toString());
        System.out.print("->");
        if (treeNode.getLeftChild()!=null){
            binaryTreePrologue(treeNode.getLeftChild());
        }
        if (treeNode.getRightChild()!=null){
            binaryTreePrologue(treeNode.getRightChild());
        }
    }

    /**
     * 前序遍历查找
     * @param treeNode
     * @return
     */
    public static TreeNode treePrologueSearch(TreeNode treeNode,int key){
        System.out.println("进入前序遍历");
        if (treeNode.getKey()==key){
            return treeNode;
        }
        TreeNode findTreeNode=null;
        if (treeNode.getLeftChild()!=null){
            findTreeNode=treePrologueSearch(treeNode.getLeftChild(),key);
        }
        if (findTreeNode!=null){
            return findTreeNode;
        }
        if (treeNode.getRightChild()!=null){
            findTreeNode=treePrologueSearch(treeNode.getRightChild(),key);
        }
        return findTreeNode;
    }


    /**
     * 中序遍历
     * @param treeNode
     */
    public static void binaryTreeMiddle(TreeNode treeNode){
        //前序遍历顺序： 左节点 -> 父节点 -> 右节点

        if (treeNode.getLeftChild()!=null){
            binaryTreeMiddle(treeNode.getLeftChild());
        }

        System.out.print(treeNode.toString());
        System.out.print("->");

        if (treeNode.getRightChild()!=null){
            binaryTreeMiddle(treeNode.getRightChild());
        }
    }


    /**
     * 中序遍历查找节点
     * @param treeNode
     * @param key
     * @return
     */
    public static TreeNode treeMiddleSearch(TreeNode treeNode,int key){
        TreeNode findTreeNode=null;
        if (treeNode.getLeftChild()!=null){
               findTreeNode=treeMiddleSearch(treeNode.getLeftChild(),key);
        }
        if (findTreeNode!=null){
            return findTreeNode;
        }
        System.out.println("进入中序遍历");
        if (treeNode.getKey()==key){
            return treeNode;
        }
        if (treeNode.getRightChild()!=null){
            findTreeNode=treeMiddleSearch(treeNode.getRightChild(),key);
        }
        return findTreeNode;
    }


    /**
     * 后序遍历
     * @param treeNode
     */
    public static void binaryTreePost(TreeNode treeNode){
        //前序遍历顺序： 左节点 -> 右节点 -> 父节点


        if (treeNode.getLeftChild()!=null){
            binaryTreePost(treeNode.getLeftChild());
        }

        if (treeNode.getRightChild()!=null){
            binaryTreePost(treeNode.getRightChild());
        }

        System.out.print(treeNode.toString());
        System.out.print("->");

    }

    /**
     * 后续遍历查找
     * @param treeNode
     * @param key
     * @return
     */
    public static TreeNode treePostSearch(TreeNode treeNode,int key){
        TreeNode findTreeNode=null;
        if (treeNode.getLeftChild()!=null){
            findTreeNode=treePostSearch(treeNode.getLeftChild(),key);
        }
        if (findTreeNode!=null){
            return findTreeNode;
        }
        if (treeNode.getRightChild()!=null){
            findTreeNode=treePostSearch(treeNode.getRightChild(),key);
        }
        if (findTreeNode!=null){
            return findTreeNode;
        }
        System.out.println("进入后序遍历");
        if (treeNode.getKey()==key){
            return treeNode;
        }
        return null;
    }

}
