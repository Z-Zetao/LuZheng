package pointToOffer.Offer11_20;

import java.util.Arrays;

/**
 * 编写一个函数，输入是一个无符号整数(以二进制串的形式)，返回其二进制表达式中数字位数为 '1' 的个数(也被称为 汉明重量).
 *
 * 编译器使用 二进制补码 记法来表示有符号整数。
 *
 * 输入必须是长度为 32 的 二进制串 。
 *
 * @author 51465
 */
public class Offer15 {
    public static void main(String[] args) {
        Offer15 offer15 = new Offer15();
        int i = offer15.hammingWeight(-3);
        System.out.println(i);
    }

    /**
     * 所以我们的第一目标是要将其变为补码的形式存储——存储在一个32位的数组中
     * 遍历数组去寻找1的个数
     * @param n 输入的整数
     * @return 该无符号数二进制数的1的个数
     */
    public int hammingWeight(int n) {
        int[] array = new int[32];
        int abs = Math.abs(n);
        //将n转变为补码的形式存储
        while (abs > 0){
            int m = 0;
            while (true){
                if (Math.pow(2,m) > abs){
                    array[32 - m] = 1;
                    abs = abs - (int) Math.pow(2,m - 1);
                    break;
                }
                m++;
            }
        }
        System.out.println(Arrays.toString(array));
        //负数的时候要改变一下反码的形式
        if (n < 0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0){
                    array[i] = 1;
                }else {
                    array[i] = 0;
                }
            }
            //+1
            if (array[array.length - 1] == 0){
                array[array.length - 1] = 1;
            }else {
                for (int i = array.length - 1; i > 0; i--) {
                    if (array[i] == 1){
                        array[i] = 0;
                    }else{
                        array[i] = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
        //遍历数组寻求1的个数
        int ans = 0;
        for (int j : array) {
            if (j == 1) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * 当一个二进制数 & 1 = 0,则二进制最后一位为0
     * 当一个二进制数 & 1 = 1,则二进制最后一位为1
     * @param n 输入的整数
     * @return 该无符号数二进制数的1的个数
     */
    public int hammingWeightAnswer(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
