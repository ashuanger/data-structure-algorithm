package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author 爽
 */
public class Shell {


    public static void main(String[] args) {
        int[] array = new int[80000];
        for (int i = 0; i < 80000; i++) {
            array[i] = (int) (Math.random() * 80000);
        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("=====================");
//        shellSortExchange(array);
        shellSortMove(array);
//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));

    }


    /**
     * 希尔排序算法:交换法
     *
     * @param array
     */
    public static void shellSortExchange(int[] array) {
        long beginTime=System.currentTimeMillis();

        int length = array.length / 2;
        while (length > 0) {
            for (int i = length; i < array.length; i++) {
                for (int j = i - length; j >= 0; j -= length) {
                    int temp;
                    if (array[j] > array[j + length]) {
                        temp = array[j];
                        array[j] = array[j + length];
                        array[j + length] = temp;
                    }
                }
            }

            length = length / 2;
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);
    }

    /**
     * 希尔排序算法:移动法
     *
     * @param array
     */
    public static void shellSortMove(int [] array){

        long beginTime=System.currentTimeMillis();

        int length = array.length / 2;
        while (length > 0) {
            for (int i = length; i < array.length; i++) {
                int j=i;
                int indexValue=array[j];
                if (array[j]<array[j-length]){
                    while (j-length>=0 && indexValue < array[j-length]){
                        array[j]=array[j-length];
                        j-=length;
                    }
                    if (j!=i){
                        array[j]=indexValue;
                    }
                }
            }
//            System.out.println(Arrays.toString(array));
            length = length / 2;
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);
    }

}
