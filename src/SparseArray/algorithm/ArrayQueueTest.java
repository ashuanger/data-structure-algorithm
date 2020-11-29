package SparseArray.algorithm;

import SparseArray.node.ArrayQueue;

import java.util.Scanner;

/**
 * @author 爽
 * 验证数组队列
 */
public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueue arrayQueue=new ArrayQueue(4);
        char key=' ';
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        while (loop){
            key=scanner.next().charAt(0);
            switch (key){
                case 's':
                    System.out.println("s(show):显示队列");
                    arrayQueue.showQueue();
                    break;
                case 'e':
                    System.out.println("e(exit):退出程序");
                    scanner.close();
                    loop=false;
                    break;
                case 'a':
                    System.out.println("输入一个数据");
                    int addValue=scanner.nextInt();
                    System.out.println("a(add):入队");
                    arrayQueue.addQueue(addValue);
                    break;
                case 'o':
                    System.out.println("o(out):出队");
                    try {
                        int outValue=arrayQueue.outQueue();
                        System.out.println("出队数据为："+outValue);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    System.out.println("h(hand):查看队头");
                    try {
                        int handValue=arrayQueue.handQueue();
                        System.out.println("查看队头："+handValue);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }

        }
    }
}
