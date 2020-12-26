package SparseArray.algorithm;

/**
 * 八皇后
 * @author 爽
 */
public class Queue {

    /**
     * 定义一个max表示多少个皇后
     */
    int max=8;
    int[] array=new int[max];
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.chess(0);
    }

    /**
     * 输出棋子摆放位置
     */
    private void print(){
        for (int i:
             array) {
            System.out.print(i+1+" ");
        }
        System.out.println();
    }


    /**
     * 放置第n个棋子
     * @param n
     */
    public void chess(int n){
        //当n=max时，已经放置完了
        if (n==max){
            print();
            return;
        }
        //依次放入皇后,并判断是否冲突
        for (int i = 0; i < max ; i++) {
            //先把当前的皇后放到该行的第1列
            array[n]=i;
            //当放置了第n个皇后时，判断是否冲突
            if (check(n)){
                //如果不冲突，就开始放置第n+1个皇后
                chess(n+1);
            }
            //如果冲突，往后面一个位置放置棋子
        }

    }


    /**
     * 查询放置第n个皇后的时候，检测该皇后是否和其他已经摆放的皇后起冲突
     * @param n
     * @return
     */
    private boolean check(int n){
        for (int i = 0; i < n ; i++) {
            //判断是否冲突：是否在同一列/是否在同一斜线(横向距离和纵向距离相等)
            if (array[i]==array[n]||
            Math.abs(n-i)==Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }
}
