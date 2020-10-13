package SparseArray.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author 爽
 */
public class ArrayEntity implements Serializable {


    /**
     * 二维数组
     */
    private int [][] array;

    /**
     * 稀疏数组
     */
    private int [][] sparseArray;
    /**
     * 稀疏转二维数组
     */
    private int [][] sparseToArray;

    public int[][] getSparseArray() {
        return sparseArray;
    }

    public void setSparseArray(int[][] sparseArray) {
        this.sparseArray = sparseArray;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int[][] getSparseToArray() {
        return sparseToArray;
    }

    public void setSparseToArray(int[][] sparseToArray) {
        this.sparseToArray = sparseToArray;
    }

    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                ", sparseArray=" + Arrays.toString(sparseArray) +
                '}';
    }


    /**
     * 打印二维数组
     */
    public void printArray(){
        for (int[] row:
             array) {
            for (int data:
                 row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }

    /**
     * 打印稀疏数组
     */
    public void printSparseArray(){
        for (int[] row:
                sparseArray) {
            for (int data:
                    row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }

    /**
     * 打印稀疏数组转二维数组
     */
    public void printSparseToArray(){
        for (int[] row:
                sparseToArray) {
            for (int data:
                    row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
