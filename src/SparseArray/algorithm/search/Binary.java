package SparseArray.algorithm.search;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

/**
 * 二分查找
 *
 * @author 爽
 */
public class Binary {

    public static void main(String[] args) {
        int []array={1,4,5,8,12,16,19,22,34,57,57,57,57,72,79};
//        int index=binarySearch(array,100);
//        System.out.println("index:"+index);
//        if (index>=0){
//            System.out.println("value:"+array[index]);
//        }
        List<Integer> list=binarySearchList(array,57);
        System.out.println(list);
    }


    /**
     * 二分查找算法
     * @param array
     * @param value
     * @return
     */
    public static int binarySearch(int [] array,int value){
        int left =0;
        int right=array.length-1;
        int mid=(left+right)/2;
        int index=-1;
        while (left<=right){
            if (array[mid]==value){
                index=mid;
                break;
            }
            if (array[mid]>value){
                right=mid-1;
            }
            if (array[mid]<value){
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        return index;
    }


    /**
     * 二分查找算法所有下标
     * @param array
     * @param value
     * @return
     */
    public static List<Integer> binarySearchList(int [] array, int value){
        List<Integer> list=new ArrayList<>(array.length);
        int left =0;
        int right=array.length-1;
        int mid=(left+right)/2;
        int index=-1;
        while (left<=right){
            if (array[mid]==value){
                index=mid;
                break;
            }
            if (array[mid]>value){
                right=mid-1;
            }
            if (array[mid]<value){
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        list.add(index);
        if (index==-1){
            return list;
        }
        int leftMid=index-1,rightMid=index+1;
        while (leftMid>=0){
            if (array[leftMid]==value){
                list.add(leftMid);
            }
            if (array[leftMid]!=value){
                break;
            }
            leftMid--;
        }
        while (rightMid<=array.length-1){
            if (array[rightMid]==value){
                list.add(rightMid);
            }
            if (array[rightMid]!=value){
                break;
            }
            rightMid++;
        }
        return list;
    }
}





















