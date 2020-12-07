package SparseArray.entity;

/**
 * @author 爽
 * 数组栈实体类
 */
public class ArrayStack {

    /**
     * 栈的大小
     */
    private int maxSize;

    /**
     * 数组模拟栈
     */
    private int[] stack;

    /**
     * 栈顶
     */
    private int top;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack=new int[maxSize];
        this.top=-1;
    }

    /**
     * 判断是否栈满
     * @return
     */
    public boolean isFull(){

        return this.top==this.maxSize-1;
    }

    /**
     * 判断是否栈空
     * @return
     */
    public boolean isEmpty(){

        return this.top==-1;
    }


    /**
     * 入栈
     * @param value
     * @return
     */
    public int push(int value){
        /**
         * 判断是否栈满
         */
        if (isFull()){
            throw new RuntimeException("入栈失败,栈已满");
        }
        System.out.println("入栈元素："+value);
        stack[++top]=value;
        return top;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
        /**
         * 判断是否栈空
         */
        if (isEmpty()){
            throw new RuntimeException("出栈失败,栈为空");
        }
        return stack[top--];
    }


    /**
     * 遍历栈
     */
    public void list(){
        /**
         * 判断是否栈空
         */
        if (isEmpty()){
            throw new RuntimeException("出栈失败,栈为空");
        }
        for (int i = top; i >=0 ; i--) {
            System.out.println(stack[i]);
        }

    }
}
