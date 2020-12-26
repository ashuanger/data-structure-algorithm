package SparseArray.algorithm;

/**
 * @author 爽
 * 迷宫
 */
public class MazeMain {

    public static void main(String[] args) {
        //创建一个二维数组，模拟迷宫
        int [][] map =new int[8][7];
        //初始化迷宫
        for (int i = 0; i <7 ; i++) {
            map[0][i]=1;
            map[7][i]=1;
        }
        for (int i = 0; i < 7; i++) {
            map[i][0]=1;
            map[i][6]=1;
        }
        //设置挡板
        map[3][1]=1;
        map[3][2]=1;
        map[2][2]=1;
        //输出地图
        traverse(map);
        //使用递归回溯找路
        setWay(map,1,1);
        System.out.println("==================");
        traverse(map);
    }

    public static void traverse(int [][] map){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
    }


    /**
     * 使用递归回溯找路：
     * 1. map表示地图
     * 2.i,jb表示从地图哪个位置开始出发(1，1)
     * 3.如果小球能到map[6][5] 位置，则说明通路找到
     * 4.约定：当map[i][j] 为 0 表示该点没有走过，1.表示墙 ,2.表示路可以走通, 3.表示该点以走过，但是不通
     * 5.在走迷宫时需要确定策略，先走下面，再走右边，再走上面，再走左边 下->右->上->左,如果该点走不通就回溯
     * @param map 地图
     * @param i 从哪个位置开始找
     * @param j
     * @return 找到路就返回true，找不到就返回false
     */
    public static boolean setWay(int [][] map,int i, int j){
        if (map[6][5]==2) return true;

        if (map[i][j]==0){
            //假定该点能走通
            map[i][j]=2;
            //向下走
            if (setWay(map,i+1,j)){
                return true;
            }
            //向右走
            else if (setWay(map,i,j+1)){
                return true;
            }
            //向上走
            else if (setWay(map,i-1,j)){
                return true;
            }
            //向左走
            else if (setWay(map,i,j-1)){
                return true;
            }else {
                map[i][j]=3;
            }
        }else {
            return false;
        }

        return false;

    }
}
