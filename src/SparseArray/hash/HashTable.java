package SparseArray.hash;

/**
 * hash 列表
 *
 * @author 爽
 */
public class HashTable {

    private HashLinkList[] hashLinkLists;

    private int size;

    public HashTable() {
        this.size = 16;
        this.hashLinkLists = new HashLinkList[size];
    }

    public HashTable(int size) {
        this.size = size;
        this.hashLinkLists = new HashLinkList[size];
    }

    /**
     * 添加节点
     *
     * @param emp
     */
    public void add(Emp emp) {
        int hash = hashCode(emp.getId());
        if (hashLinkLists[hash] == null) {
            HashLinkList hashLinkList = new HashLinkList();
            hashLinkList.add(emp);
            hashLinkLists[hash] = hashLinkList;
            return;
        }
        hashLinkLists[hash].add(emp);
    }

    /**
     * 遍历链表
     */
    public void list() {
        for (int i = 0; i < size; i++) {
            System.out.println("第" + i + "个链表");
            hashLinkLists[i].list();
        }
    }

    /**
     * 查询节点
     *
     * @param id
     */
    public Emp get(int id) {
        int hashCode = hashCode(id);
        Emp emp;
        if (hashLinkLists[hashCode] == null){
            System.out.println("找不到结点");
            emp=null;
            return emp;
        }
        emp=hashLinkLists[hashCode].get(id);
        if (emp==null){
            System.out.println("找不到结点");
            return emp;
        }
        System.out.println(emp.toString());
        return emp;
    }

    /**
     * 计算hash值
     *
     * @param id
     * @return
     */
    public int hashCode(int id) {
        return id % size;
    }

}
