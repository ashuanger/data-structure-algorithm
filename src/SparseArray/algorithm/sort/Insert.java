package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序算法
 *
 * @author 爽
 */
public class Insert {

    public static void main(String[] args) {
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int) (Math.random() * 80000);
        }
        insertSort(array);

//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));

    }


    /**
     * 插入排序
     *
     * @param array
     */
    public static void insertSort(int[] array) {
        long beginTime=System.currentTimeMillis();

//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));

        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                int indexValue = array[i];
                int index = i - 1;
                while (index >= 0 && indexValue < array[index]) {
                    array[index + 1] = array[index];
                    index--;
                }
                if (index + 1 != i) {
                    array[index + 1] = indexValue;
                }
//                System.out.println(Arrays.toString(array));
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);
    }
}
