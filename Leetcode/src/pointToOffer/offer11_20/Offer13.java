package pointToOffer.offer11_20;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。
 *
 * 1 <= n,m <= 100
 * 0 <= k <= 20
 * @author 51465
 */
public class Offer13 {
    public static void main(String[] args) {
        int a = 113;
        Offer13 offer13 = new Offer13();
        int ints = offer13.movingCount1(1,2,1);
        System.out.println(ints);
    }

    /**
     * 这个做法的错误之处就在于没有考虑机器人只能走一步
     * ①用m、n创建一个二维数组
     * ②遍历每个位置,小于k的标记为1
     * ③计算1的个数
     *
     * @param m m行
     * @param n n列
     * @param k 限制条件
     * @return 机器人可进入的格子数
     */
    public int movingCount(int m, int n, int k) {
        int[][] ints = new int[m][n];
        int ans = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                if (count(i) + count(j) <= k){
                    ans++;
                }
            }
        }
        return ans;
    }

    int count(int i) {
        int a = i / 100;
        int b = i / 10 - a * 10;
        int c = i % 10;
        return a + b + c;
    }


    public int movingCount1(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        int res = 0;
        Queue<int[]> queue= new LinkedList<>();
        //数组的四个数分别表示
        //①第x[0]行
        //②第x[1]列
        //③x[0]数的和
        //④x[1]数的和
        queue.add(new int[] { 0, 0, 0, 0 });
        while(queue.size() > 0) {
            //获取并删除元素
            int[] x = queue.poll();
            int i = x[0], j = x[1], si = x[2], sj = x[3];
            if(i >= m || j >= n || k < si + sj || visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            res ++;
            //将这个数的右边和下边的数添加进链表中
            //求和这个你写两个数就知道为什么了
            //当i为19时和为10,+1之后为20和为2
            //当i为18时和为9,+1之后为19和为10
            queue.add(new int[] { i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj });
            queue.add(new int[] { i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8 });
        }
        return res;
    }


}
