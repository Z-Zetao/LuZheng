package pointToOffer.offer21_30;

import java.util.Arrays;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 *
 * @author 51465
 */
public class Offer29 {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Offer29 offer29 = new Offer29();
        int[] ans = offer29.spiralOrder(ints);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 这里的终止条件就是在遍历某一层之后
     * 在移动的时候它已经碰到另一边了，就结束循环
     */
    public int[] spiralOrderAnswer(int[][] matrix) {
        if(matrix.length == 0) {
            return new int[0];
        }
        //定义左右上下四条边的索引
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1, x = 0;
        int[] res = new int[(right + 1) * (bottom + 1)];
        while(true) {
            //从左向右循环
            for(int i = left; i <= right; i++) {
                res[x++] = matrix[top][i];
            }
            //循环之后最上面那一层就结束了，所以top就要往下移一格
            if(++top > bottom) {
                break;
            }
            for(int i = top; i <= bottom; i++) {
                res[x++] = matrix[i][right];
            }
            if(left > --right) {
                break;
            }
            for(int i = right; i >= left; i--) {
                res[x++] = matrix[bottom][i];
            }
            if(top > --bottom) {
                break;
            }
            for(int i = bottom; i >= top; i--) {
                res[x++] = matrix[i][left];
            }
            if(++left > right) {
                break;
            }
        }
        return res;
    }


    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0){
            return new int[0];
        }
        if (matrix.length == 1){
            int[] ints = new int[matrix[0].length];
            System.arraycopy(matrix[0], 0, ints, 0, matrix[0].length);
            return ints;
        }
        if (matrix[0].length == 1){
            int[] ints = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                ints[i] = matrix[i][0];
            }
            return ints;
        }
        int m = matrix.length , n = matrix[0].length;
        //一维数组用来输出数据
        int k = 0;
        int[] ans = new int[m * n];
        //二维矩阵用来标记当前数是否被输出过
        boolean[][] temp = new boolean[m][n];
        int i = 0,j = 0;
        while (k < m * n){
            while (!temp[i][j]){
                ans[k] = matrix[i][j];
                temp[i][j] = true;
                k++;j++;
                if (j == n){
                    break;
                }
            }
            j--;
            i++;
            while (!temp[i][j]){
                ans[k] = matrix[i][j];
                temp[i][j] = true;
                i++;k++;
                if (i == m){
                    break;
                }
            }
            i--;
            j--;
            while (!temp[i][j]){
                ans[k] = matrix[i][j];
                temp[i][j] = true;
                j--;k++;
                if (j < 0){
                    break;
                }
            }
            j++;
            i--;
            while (!temp[i][j]){
                ans[k] = matrix[i][j];
                temp[i][j] = true;
                i--;k++;
                if (i < 0){
                    break;
                }
            }
            i++;
            j++;
        }
        return ans;
    }
}
