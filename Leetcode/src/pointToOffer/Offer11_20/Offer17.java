package pointToOffer.Offer11_20;

import java.util.Arrays;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 用返回一个整数列表来代替打印
 * n 为正整数
 *
 * @author 51465
 */
public class Offer17 {
    public static void main(String[] args) {
        Offer17 offer17 = new Offer17();
        int[] ints = offer17.printNumbers(3);
        for (int i : ints) {
            System.out.print(i + "  ");
            if (i % 50 == 0){
                System.out.println();
            }
        }
    }

    /**
     *
     * @param n 正整数n
     * @return 返回整数列表
     */
    public int[] printNumbers(int n) {
        int[] ints = new int[(int) (Math.pow(10, n) - 1)];
        for (int i = 0; i < Math.pow(10, n) - 1; i++) {
            ints[i] = i + 1;
        }
        return ints;
    }
}
