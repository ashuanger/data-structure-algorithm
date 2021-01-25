package SparseArray.algorithm.search;

import java.util.Arrays;

/**
 * 线性查找
 *
 * @author 爽
 */
public class Seq {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 99);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(seqSearch(array,100));
    }

    /**
     * 线性查找算法
     *
     * @param array
     * @param value
     * @return
     */
    public static int seqSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
