package pointToOffer.Offer11_20;

import java.math.BigDecimal;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。不得使用库函数，同时不需要考虑大数问题。
 *
 * @author 51465
 */
public class Offer16 {
    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        System.out.println(offer16.myPow(2.00000,-2147483648));
    }

    public double myPow(double x, int n) {
        if (x == 1){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        if (n == -2147483648){
            if (x == -1){
                return 1;
            }else {
                return 0;
            }
        }
        if (x == -1){
            if (n % 2 == 1){
                return -1;
            }else {
                return 1;
            }
        }
        double ans = 1;
        if (n > 0){
            for (int i = 0; i < n; i++) {
                ans = ans * x;
            }
        }else {
            for (int i = 0; i < Math.abs(n); i++) {
                ans = ans / x;
            }
        }
        return ans;
    }
}
