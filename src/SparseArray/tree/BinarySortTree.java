package SparseArray.tree;

/**
 * 二叉排序树：左子节点比父节点小，右节点比父节点小
 *
 * @author 爽
 */
public class BinarySortTree {


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
    }

    /**
     * 删除节点
     * @param key
     * @param root
     * @return
     */
    public static void deleteNode(int key,TreeNode root){
        TreeNode patientNode=searchParent(key,root);
        if (patientNode == null){
            return ;
        }
        TreeNode targetNode=search(key,root);
        if (targetNode == null){
            return ;
        }
        //1.目标节点没有子节点
        TreeNode leftNode=targetNode.getLeftChild();
        TreeNode rightNode=targetNode.getRightChild();
        if (leftNode == null && rightNode == null){
            if (patientNode.getLeftChild() != null &&
                    patientNode.getLeftChild().getKey() == targetNode.getKey()){
                patientNode.setLeftChild(null);
            }
            if (patientNode.getRightChild() != null &&
                    patientNode.getRightChild().getKey() == targetNode.getKey()){
                patientNode.setRightChild(null);
            }
        }
        //2.目标节点只有一个子节点
        if (leftNode == null | rightNode == null){
            if (patientNode.getLeftChild() != null &&
                    patientNode.getLeftChild().getKey() == targetNode.getKey()){
                if (leftNode != null ){
                    patientNode.setLeftChild(leftNode);
                }
                if (rightNode != null){
                    patientNode.setLeftChild(rightNode);
                }
            }
            if (patientNode.getRightChild() != null &&
                    patientNode.getRightChild().getKey() == targetNode.getKey()){
                if (leftNode != null ){
                    patientNode.setRightChild(leftNode);
                }
                if (rightNode != null){
                    patientNode.setRightChild(rightNode);
                }
            }
        }
        //3.目标节点有两个子节点
        if (leftNode != null && rightNode != null){
            TreeNode tempNode=targetNode;
            while (tempNode.getLeftChild() != null){
                tempNode=tempNode.getLeftChild();
            }
            deleteNode(tempNode.getKey(),root);
            targetNode.setKey(tempNode.getKey());
            targetNode.setValue(tempNode.getValue());
        }
        return ;
    }

    /**
     * 根据key查找的节点
     * @param key
     * @param root
     * @return
     */
    public static TreeNode search(int key,TreeNode root){
        if (key == root.getKey()){
            return root;
        }
        if (root.getKey() > key ){
            if (root.getLeftChild() != null){
                return search(key,root.getLeftChild());
            }
            if (root.getLeftChild() == null){
                return null;
            }
        }
        if (root.getKey() <= key ){
            if (root.getRightChild() != null){
                return search(key,root.getRightChild());
            }
            if (root.getRightChild() == null){
                return null;
            }
        }
        return null;
    }


    /**
     * 根据key查找父节点
     * @param key
     * @param root
     * @return
     */
    public static TreeNode searchParent(int key,TreeNode root){
        if (root.getLeftChild() != null){
            if (root.getLeftChild().getKey() == key){
                return root;
            }
            if (root.getKey() > key){
                return searchParent(key,root.getLeftChild());
            }
        }
        if (root.getRightChild() != null){
            if (root.getRightChild().getKey() == key){
                return root;
            }
            if (root.getKey() <= key){
                return searchParent(key,root.getRightChild());
            }
        }
        return null;
    }

}
