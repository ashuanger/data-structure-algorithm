package SparseArray.algorithm;

import SparseArray.entity.ArrayEntity;
import org.junit.Test;

import java.io.*;

/**
 * @author 爽
 * 二维数组转稀疏数组
 */
public class ArrayToSparse {


    /**
     * 二维数组与稀疏数组之间的转换
     */
    @Test
    public void testArrayToSparse(){
        ArrayEntity arrayEntity=new ArrayEntity();
        int [][] array = new int[11][11];
        array[0][2]=9;
        array[1][2]=1;
        array[2][3]=2;
        array[10][10]=7;
        arrayEntity.setArray(array);
        int [][] sparseArray = arrayToSparse(array);
        arrayEntity.setSparseArray(sparseArray);
        int [][] sparseToArray=sparseToArray(sparseArray);
        arrayEntity.setSparseToArray(sparseToArray);
        System.out.println("==============二维数组============");
        arrayEntity.printArray();
        System.out.println("==============稀疏数组============");
        arrayEntity.printSparseArray();
        System.out.println("==============稀疏数组转二维数组============");
        arrayEntity.printSparseToArray();
    }


    /**
     * 序列化稀疏数组
     */
    @Test
    public void SerializationEntity(){
        ArrayEntity arrayEntity=new ArrayEntity();
        int [][] array = new int[11][11];
        array[0][2]=3;
        array[1][2]=2;
        array[2][3]=5;
        array[10][10]=8;
        arrayEntity.setArray(array);
        int [][] sparseArray = arrayToSparse(array);
        arrayEntity.setSparseArray(sparseArray);
        System.out.println("==============二维数组============");
        arrayEntity.printArray();
        System.out.println("==============稀疏数组============");
        arrayEntity.printSparseArray();
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(
                    new FileOutputStream("D:\\code\\SerializationData\\sparseArray.txt"));
            objectOutputStream.writeObject(sparseArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化稀疏数组
     */
    @Test
    public void BackSerializationEntity(){

        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(
                    new FileInputStream("D:\\code\\SerializationData\\sparseArray.txt"));
            int [][] sparseArray=(int [][])objectInputStream.readObject();
            int [][] array=sparseToArray(sparseArray);
            System.out.println("==============二维数组============");
            for (int[] row:
                    array) {
                for (int data:
                        row) {
                    System.out.printf("%d\t",data);
                }
                System.out.println();
            }
        } catch (Exception  e) {
            e.printStackTrace();
        }

    }



    /**
     * 二维数组转稀疏数组
     * @param array
     * @return
     */
    public int[][] arrayToSparse(int [][] array){
        //行数
        int row=array.length;
        //列数
        int col=array[0].length;
        //有效内容个数
        int count=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                if (array[i][j]!=0){
                    count++;
                }
            }
        }
        int [][] sparseArray = new int[count+1][3];
        sparseArray[0][0]=row;
        sparseArray[0][1]=col;
        sparseArray[0][2]=count;
        addMember(sparseArray,array,row,col);
        return sparseArray;
    }

    /**
     * 稀疏数组里添加成员
     * @param sparseArray
     * @param array
     */
    public void addMember(int [][] sparseArray,int [][] array,int row,int col){
        int sum=1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                if (array[i][j]!=0){
                    sparseArray[sum][0]=i;
                    sparseArray[sum][1]=j;
                    sparseArray[sum][2]=array[i][j];
                    sum++;
                }
            }
        }
    }

    /**
     * 稀疏数组转二维数组
     * @param sparseArray
     * @return
     */
    public int[][] sparseToArray(int [][] sparseArray){
        //行数
        int row=sparseArray[0][0];
        //列数
        int col=sparseArray[0][1];
        //有效值个数
        int valCount=sparseArray[0][2];
        //稀疏转二维数组
        int [][] sparseToArray=new int[row][col];
        for (int i = 1; i <= valCount; i++) {
            //第几行
            int arrayRow=sparseArray[i][0];
            //第几列
            int arrayCol=sparseArray[i][1];
            //第几行
            int val=sparseArray[i][2];
            //赋值
            sparseToArray[arrayRow][arrayCol]=val;
        }
        return sparseToArray;
    }

}
