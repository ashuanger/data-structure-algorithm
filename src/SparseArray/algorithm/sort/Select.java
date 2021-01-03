package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序算法
 *
 * @author 爽
 */
public class Select {

    public static void main(String[] args) {
        int[] array = new int[80000];
        for (int i = 0; i <80000 ; i++) {
            array[i]=(int)(Math.random()*80000);
        }

        selectSort(array);
//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));
    }


    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        long beginTime=System.currentTimeMillis();

        int index;
        int minIndex;
//        System.out.println(Arrays.toString(array));
//        System.out.println("=====================");
        for (int i = 0; i < array.length - 1; i++) {
            //找到最小的数
            minIndex = i;
            for (int j = i; j < array.length - 1; j++) {
                if (array[minIndex] > array[j + 1]) {
                    minIndex = j + 1;
                }
            }
            if (minIndex!=i){
                index = array[i];
                array[i] = array[minIndex];
                array[minIndex] = index;
//                System.out.println("第"+(i+1)+"次:"+Arrays.toString(array));
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);
    }
}
