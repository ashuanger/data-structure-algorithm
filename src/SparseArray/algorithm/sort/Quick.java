package SparseArray.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序算法
 *
 * @author 爽
 */
public class Quick {


    public static void main(String[] args) {
        int[] array = new int[800000];
        for (int i = 0; i < 800000; i++) {
            array[i] = (int) (Math.random() * 800000);
        }
//        System.out.println(Arrays.toString(array));
        long beginTime=System.currentTimeMillis();

        quickSort(array,0,array.length-1);

//        System.out.println(Arrays.toString(array));
        long endTime=System.currentTimeMillis();
        System.out.println((endTime-beginTime));
        System.out.println((endTime-beginTime)/1000);

    }


    /**
     * 快速排序算法
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort(int [] array,int left,int right){
        //递归结束条件：left大于等于right
        if (left>=right){
            return;
        }
        //计算基准元素的位置
        int pivotIndex=partition(array,left,right);
        //左边递归进行排序
        quickSort(array,left,pivotIndex-1);
        //右边递归进行排序
        quickSort(array,pivotIndex+1,right);

    }

    /**
     * 计算基准元素的位置
     * @param array
     * @param beginIndex
     * @param endIndex
     * @return
     */
    public static int partition(int [] array,int beginIndex,int endIndex){

        int pivot =array[beginIndex];
        int left=beginIndex;
        int right=endIndex;

        while (left!=right){

            //右指针向左边寻找小于标准值的数
            while (left<right && array[right] > pivot){
                right--;
            }
            //左指针向右边寻找大于标准值的数
            while (left < right && array[left] <= pivot){
                left++;
            }
            //左右指针进行数据交换
            if (left < right){
                int index=array[left];
                array[left]=array[right];
                array[right]=index;
            }
        }
        int index=array[left];
        array[left]=pivot;
        array[beginIndex]=index;

        return left;
    }
}
