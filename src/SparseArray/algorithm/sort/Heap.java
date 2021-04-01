package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序算法
 *
 * @author 爽
 */
public class Heap {

    public static void main(String[] args) {
        int[] array = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            array[i] = (int) (Math.random() * 10000000);
        }

//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));
        heapSort(array);
//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));

    }

    /**
     * 上浮调整
     *
     * @param arr
     * @param parentIndex
     * @param length
     */
    public static void upAdjust(int[] arr, int parentIndex, int length) {
        //临时变量
        int temp = arr[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && arr[childIndex + 1] > arr[childIndex]) {
                childIndex++;
            }
            if (temp >= arr[childIndex]) {
                break;
            }
            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = childIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }

    /**
     * 堆排序算法
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        long beginTime=System.currentTimeMillis();

        for (int i = array.length / 2 - 1; i >= 0; i--) {
            upAdjust(array, i, array.length);
        }
        for (int i = array.length-1; i >0 ; i--) {
            int temp=array[i];
            array[i]=array[0];
            array[0]=temp;
            upAdjust(array,0,i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);
    }
}
