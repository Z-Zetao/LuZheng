package pointToOffer;

/**
 * 在一个n * m的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 * @author 51465
 */
public class Offer04 {

    public static void main(String[] args) {
        int[][] ints = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        Offer04 offer04 = new Offer04();
        System.out.println(offer04.findNumberIn2DArrayAnswer(ints, 100));
    }


    /**
     * 这是从左上角找起的
     * @param matrix 二维矩阵
     * @param target 目标数
     * @return 二位矩阵中有没有目标数
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > target){
                    break;
                }
                if (matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean findNumberIn2DArrayAnswer(int[][] matrix, int target) {
        int i = matrix.length - 1,j = 0;
        while (i >= 0 && j < matrix[0].length){
            if (matrix[i][j] > target){
                i--;
            }else if (matrix[i][j] < target){
                j++;
            }else {
                return true;
            }
        }
        return false;
    }
}
