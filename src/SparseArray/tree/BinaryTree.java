package SparseArray.tree;

/**
 * 遍历树
 *
 * @author 爽
 */
public class BinaryTree {


    /**
     * 前序遍历
     *
     * @param treeNode
     */
    public static void binaryTreePrologue(TreeNode treeNode) {
        if (treeNode == null){
            System.out.println("根节点为空");
            return;
        }
        //前序遍历顺序：父节点 -> 左节点 -> 右节点
        System.out.print(treeNode.toString());
        System.out.print("->");
        if (treeNode.getLeftChild() != null) {
            binaryTreePrologue(treeNode.getLeftChild());
        }
        if (treeNode.getRightChild() != null) {
            binaryTreePrologue(treeNode.getRightChild());
        }
    }

    /**
     * 前序遍历查找
     *
     * @param treeNode
     * @return
     */
    public static TreeNode treePrologueSearch(TreeNode treeNode, int key) {
        System.out.println("进入前序遍历");
        if (treeNode.getKey() == key) {
            return treeNode;
        }
        TreeNode findTreeNode = null;
        if (treeNode.getLeftChild() != null) {
            findTreeNode = treePrologueSearch(treeNode.getLeftChild(), key);
        }
        if (findTreeNode != null) {
            return findTreeNode;
        }
        if (treeNode.getRightChild() != null) {
            findTreeNode = treePrologueSearch(treeNode.getRightChild(), key);
        }
        return findTreeNode;
    }


    /**
     * 中序遍历
     *
     * @param treeNode
     */
    public static void binaryTreeMiddle(TreeNode treeNode) {
        //中序遍历顺序： 左节点 -> 父节点 -> 右节点

        if (treeNode.getLeftChild() != null) {
            binaryTreeMiddle(treeNode.getLeftChild());
        }

        System.out.print(treeNode.toString());
        System.out.print("->");

        if (treeNode.getRightChild() != null) {
            binaryTreeMiddle(treeNode.getRightChild());
        }
    }


    /**
     * 中序遍历查找节点
     *
     * @param treeNode
     * @param key
     * @return
     */
    public static TreeNode treeMiddleSearch(TreeNode treeNode, int key) {
        TreeNode findTreeNode = null;
        if (treeNode.getLeftChild() != null) {
            findTreeNode = treeMiddleSearch(treeNode.getLeftChild(), key);
        }
        if (findTreeNode != null) {
            return findTreeNode;
        }
        System.out.println("进入中序遍历");
        if (treeNode.getKey() == key) {
            return treeNode;
        }
        if (treeNode.getRightChild() != null) {
            findTreeNode = treeMiddleSearch(treeNode.getRightChild(), key);
        }
        return findTreeNode;
    }


    /**
     * 后序遍历
     *
     * @param treeNode
     */
    public static void binaryTreePost(TreeNode treeNode) {
        //后序遍历顺序： 左节点 -> 右节点 -> 父节点
        if (treeNode.getLeftChild() != null) {
            binaryTreePost(treeNode.getLeftChild());
        }
        if (treeNode.getRightChild() != null) {
            binaryTreePost(treeNode.getRightChild());
        }
        System.out.print(treeNode.toString());
        System.out.print("->");
    }

    /**
     * 后续遍历查找
     *
     * @param treeNode
     * @param key
     * @return
     */
    public static TreeNode treePostSearch(TreeNode treeNode, int key) {
        TreeNode findTreeNode = null;
        if (treeNode.getLeftChild() != null) {
            findTreeNode = treePostSearch(treeNode.getLeftChild(), key);
        }
        if (findTreeNode != null) {
            return findTreeNode;
        }
        if (treeNode.getRightChild() != null) {
            findTreeNode = treePostSearch(treeNode.getRightChild(), key);
        }
        if (findTreeNode != null) {
            return findTreeNode;
        }
        System.out.println("进入后序遍历");
        if (treeNode.getKey() == key) {
            return treeNode;
        }
        return null;
    }


    /**
     * 删除节点：如果删除的不是非叶子结点，也将子节点删除
     *
     * @param treeNode
     * @param key
     */
    public static void deleteNodeAll(TreeNode treeNode, int key) {
        if (treeNode == null) {
            System.out.println("删除失败，节点为空");
            return;
        }
        if (treeNode.getKey() == key) {
            treeNode = null;
            return;
        }
        //判断左子节点是否为待删除节点
        if (treeNode.getLeftChild() != null && treeNode.getLeftChild().getKey() == key) {
            treeNode.setLeftChild(null);
            return;
        }
        //判断左子节点是否为待删除节点
        if (treeNode.getRightChild() != null && treeNode.getRightChild().getKey() == key) {
            treeNode.setRightChild(null);
            return;
        }
        //判断左子节点是否为空,如果不是，递归
        if (treeNode.getLeftChild() != null) {
            deleteNodeAll(treeNode.getLeftChild(), key);
        }
        //判断右子节点是否为空,如果不是，递归
        if (treeNode.getRightChild() != null) {
            deleteNodeAll(treeNode.getRightChild(), key);
        }
    }

    /**
     * 删除节点
     *
     * @param root
     * @param key
     */
    public static TreeNode deleteRoot(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.getKey() == key) {
            root = null;
            return root;
        }
        deleteNodeAll(root, key);
        return root;
    }

}
