package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author 爽
 */
public class Merge {

    public static void main(String[] args) {
        int[] array = new int[800000];
        for (int i = 0; i < 800000; i++) {
            array[i] = (int) (Math.random() * 800000);
        }
//        System.out.println(Arrays.toString(array));
        long beginTime=System.currentTimeMillis();

        mergeSort(array,0,array.length-1,new int[array.length]);

//        System.out.println(Arrays.toString(array));

        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);


    }

    /**
     * 先进行分解，再进行合并
     * @param array
     * @param left
     * @param right
     * @param temp
     */
    public static void mergeSort(int [] array,int left,int right,int [] temp){
        if (left<right){
            int mid=(left+right)/2;
            //向左递归进行分解
            mergeSort(array,left,mid,temp);
            //向右进行分解
            mergeSort(array,mid+1,right,temp);
            //分解后进行合并
            merge(array,left,mid,right,temp);
        }
    }



    /**
     * 合并方法
     *
     * @param array 原始数组
     * @param left  左边有序序列的初始索引
     * @param mid   中间索引
     * @param right 右边索引--结束索引
     * @param temp  做中转的数组
     */
    public static void merge(int[] array, int left, int mid, int right, int[] temp) {
        //左边有序序列的初始索引
        int i = left;
        //右边有序序列的初始索引
        int j = mid + 1;
        //指向临时数组的当前索引
        int index = 0;
        //1.先把左右两边的数据（有序）的数据有序地填充到临时数值,直到有一方的数据找完了
        while (i <= mid && j <= right) {
            //哪边小就添加哪边的数据
            if (array[i] < array[j]) {
                temp[index++] = array[i];
                i++;
            }
            if (array[i] >= array[j]){
                temp[index++] = array[j];
                j++;
            }
        }
        //2.把剩余未填充的都加到临时数组
        if (i<=mid){
            for (;i <= mid; i++) {
                temp[index++] = array[i];
            }
        }
        if (j<=right){
            for (;j <= right; j++) {
                temp[index++] = array[j];
            }
        }
        //3.拷贝回去
        index=0;
        while (left<=right){
            array[left]=temp[index];
            left++;
            index++;
        }
    }


}
