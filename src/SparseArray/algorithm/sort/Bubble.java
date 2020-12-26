package SparseArray.algorithm.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * 冒泡排序算法
 *
 * @author 爽
 */
public class Bubble {


    public static void main(String[] args) {
        int [] array=new int[80000];
        for (int i = 0; i <80000 ; i++) {
            array[i]=(int)(Math.random()*80000);
        }
        bubbleSort(array);
//        System.out.println("=====================");
//        System.out.println(Arrays.toString(array));
    }




    public static void bubbleSort(int[] array) {
        long beginTime=System.currentTimeMillis();
        boolean flag=false;
//        System.out.println(Arrays.toString(array));
//        System.out.println("=====================");
        for (int i = array.length - 1; i > 0; i--) {
            int index;
            flag=false;
            for (int j = 0; j < i ; j++) {
                if (array[j] > array[j + 1]) {
                    flag=true;
                    index = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = index;
                }
            }
            if (!flag){
                break;
            }
//            System.out.println(Arrays.toString(array));
        }
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);

    }


}
