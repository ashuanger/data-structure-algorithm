package SparseArray.tree;

/**
 * 平衡二叉树实现
 *
 * @author 爽
 */
public class AvlTree {


    /**
     * 左旋
     * @param root
     */
    public static void leftRotate(TreeNode root){
        TreeNode rightNode=root.getRightChild();
        //右旋时，当左子结点的右子树高度大于左子结点的左子树高度时，需要先将左子节点进行左旋
        //左旋时，当右子结点的左子树高度大于右子结点的右子树高度时，需要先将右子节点进行右旋
        if (TreeUtil.getLeftNodeHeight(rightNode)
                > TreeUtil.getRightNodeHeight(rightNode) ){
            rightRotate(rightNode);
        }
        //创建新的结点
        TreeNode newNode=new TreeNode(root.getKey());
        //设置新结点的左右子结点
        newNode.setLeftChild(root.getLeftChild());
        newNode.setRightChild(root.getRightChild().getLeftChild());
        //当前结点变为右子结点
        root.setKey(root.getRightChild().getKey());
        root.setValue(root.getRightChild().getValue());
        //重新设置结点
        root.setLeftChild(newNode);
        root.setRightChild(root.getRightChild().getRightChild());
    }

    /**
     * 右旋
     * @param root
     */
    public static void rightRotate(TreeNode root){
        TreeNode leftNode=root.getLeftChild();
        //右旋时，当左子结点的右子树高度大于左子结点的左子树高度时，需要先将左子节点进行左旋
        if (TreeUtil.getLeftNodeHeight(leftNode)
                < TreeUtil.getRightNodeHeight(leftNode) ){
            leftRotate(leftNode);
        }
        //创建新的结点
        TreeNode newNode=new TreeNode(root.getKey());
        //设置新结点的左右子结点
        newNode.setRightChild(root.getRightChild());
        newNode.setLeftChild(root.getLeftChild().getRightChild());
        //当前结点
        root.setKey(root.getLeftChild().getKey());
        root.setValue(root.getLeftChild().getValue());
        //重新设置结点
        root.setRightChild(newNode);
        root.setLeftChild(root.getLeftChild().getLeftChild());
    }

    /**
     * 添加节点
     * @param addNode
     * @param root
     */
    public static void addNode(TreeNode addNode,TreeNode root){
        if (addNode == null){
            return;
        }
        //先判断是大于父节点还是小于父节点
        if (addNode.getKey() < root.getKey()){
            if (root.getLeftChild() == null){
                root.setLeftChild(addNode);
                return;
            }
            if (root.getLeftChild() != null){
                addNode(addNode,root.getLeftChild());
            }
        }
        if (addNode.getKey() >= root.getKey()){
            if (root.getRightChild() == null){
                root.setRightChild(addNode);
                return;
            }
            if (root.getRightChild() != null){
                addNode(addNode,root.getRightChild());
            }
        }

        int leftHeight=TreeUtil.getLeftNodeHeight(root);
        int rightHeight=TreeUtil.getRightNodeHeight(root);

        if (leftHeight - rightHeight > 1){
            rightRotate(root);
        }

        if (rightHeight - leftHeight > 1){
            leftRotate(root);
        }
    }


}
