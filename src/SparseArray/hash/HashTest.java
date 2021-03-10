package SparseArray.hash;

import java.util.ArrayList;

/**
 * @author 爽
 */
public class HashTest {

    public static void main(String[] args) {
        HashTable hashTable=new HashTable(8);

        Emp emp=new Emp(1,"1","11111");
        Emp emp2=new Emp(2,"2","11111");
        Emp emp3=new Emp(3,"3","11111");
        Emp emp4=new Emp(4,"4","11111");
        Emp emp5=new Emp(5,"5","11111");
        Emp emp6=new Emp(6,"6","11111");
        Emp emp7=new Emp(7,"7","11111");
        Emp emp8=new Emp(8,"8","11111");
        Emp emp9=new Emp(9,"9","11111");
        hashTable.add(emp);
        hashTable.add(emp2);
        hashTable.add(emp3);
        hashTable.add(emp4);
        hashTable.add(emp5);
        hashTable.add(emp6);
        hashTable.add(emp7);
        hashTable.add(emp8);
        hashTable.add(emp9);
        hashTable.list();
        System.out.println("查找节点");
        hashTable.get(10);

    }
}
