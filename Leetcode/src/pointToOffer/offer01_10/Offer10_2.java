package pointToOffer.offer01_10;

/**
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * @author 51465
 */
public class Offer10_2 {
    public static void main(String[] args) {
        Offer10_2 offer10_2 = new Offer10_2();
        System.out.println(offer10_2.numWays1(7));
    }


    /**
     * 递归:
     * 跳最后那级台阶的时候有1(跳两级)+1(跳1级)共两种方法
     * 所以numWays(n) = numWays(n-1) + numWays(n-2)
     * @param n 青蛙要上n级台阶
     * @return 上n级台阶一共有多少种方法
     */
    public int numWays(int n) {
        if (n == 0 || n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else {
            return numWays(n - 1) + numWays(n - 2);
        }
    }

    /**
     * 非递归:
     * n = 0 或 1    numWays = 1
     * n = 2         numWays = 2
     * n = 3         numWays = 3
     * n = 4         numWays = 5
     * 所以就是后一个数等于前两个数相加！这就是非递归
     * @param n 青蛙要上n级台阶
     * @return 上n级台阶一共有多少种方法
     */
    public int numWays1(int n) {
        int a = 1,b = 2;
        for (int i = 1; i < n; i++) {
            int temp = b;
            b = (a + b) % 1000000007;
            a = temp;
        }
        return a;
    }
}
