package SparseArray.node;

/**
 * @author 爽
 * 数组队列
 */
public class ArrayQueue {

    private int [] arrayQueue;

    /**
     * 数组的最大容量
     */
    private int maxSize;

    /**
     * 队头下标
     */
    private int front;

    /**
     * 队尾下标
     */
    private int rear;


    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getArrayQueue() {
        return arrayQueue;
    }

    public void setArrayQueue(int[] arrayQueue) {
        this.arrayQueue = arrayQueue;
    }

    /**
     * 初始化队列，构造器
     * @param maxSize
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        //初始化数据
        arrayQueue=new int[maxSize];
        //队头
        front=-1;
        //队尾
        rear=-1;
    }


    /**
     * 入队
     * 添加数据
     * @param member
     * @return
     */
    public void addQueue(int member){
        //判断队列是否满了
        if (isFull()){
            System.out.println("入队失败，队列已满");
            return ;
        }
        //队尾+1
        rear++;
        //添加数据
        arrayQueue[rear]=member;
    }

    /**
     * 出队
     */
    public int outQueue(){
        //判断队列是否为空
        if (isEmpty()){
            throw new RuntimeException("出队失败，队列为空");
        }
        //队头+1
        front++;
        return arrayQueue[front];
    }



    /**
     * 判断队列是否是满了
     * @return
     */
    public boolean isFull(){

        return rear==maxSize-1;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty(){
        return rear==front;
    }

    /**
     * 显示队列数据
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("显示失败，队列为空");
            return;
        }
        for (int i = 0; i < arrayQueue.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arrayQueue[i]);
        }
    }

    /**
     * 显示头部数据
     * @return
     */
    public int handQueue(){
        if (isEmpty()){
            throw new RuntimeException("显示失败，队列为空");
        }
        return arrayQueue[front+1];
    }

}
