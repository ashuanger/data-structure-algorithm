package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 基数排序:空间换时间
 *
 * @author 爽
 */
public class Radix {


    public static void main(String[] args) {
        int[] array = new int[80000000];
        for (int i = 0; i < 80000000; i++) {
            array[i] = (int) (Math.random() * 800000000);
        }
//        System.out.println(Arrays.toString(array));
        long beginTime=System.currentTimeMillis();
        radixSort(array);
//        System.out.println(Arrays.toString(array));
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);

    }

    /**
     * 基数排序
     * @param array
     */
    public static void radixSort(int [] array){
        //新建二维数组，表示10个桶
        int [][] bucket=new int[10][array.length];
        int [] bucketElementCount=new int[10];
        //得到最大数组的位数
        int max=array[0];
        for (int item:
             array) {
            max=Math.max(max,item);
        }
        //第一次的除数
        int divisor=1;
        while (max!=0){
            for (int i = 0; i < array.length; i++) {
                int digitOfElement=(array[i]/divisor)%10;
                bucket[digitOfElement][bucketElementCount[digitOfElement]]=array[i];
                bucketElementCount[digitOfElement]++;
            }
            //遍历每个桶
            int index=0;
            for (int k = 0; k < bucketElementCount.length; k++) {
                if (bucketElementCount[k]>0){
                    for (int i = 0; i < bucketElementCount[k]; i++) {
                        array[index]=bucket[k][i];
                        index++;
                    }
                }
                bucketElementCount[k]=0;
            }
            divisor*=10;
            max/=10;
        }






    }
}
