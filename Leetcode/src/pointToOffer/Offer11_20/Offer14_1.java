package pointToOffer.Offer11_20;

/**
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1）,
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 *
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 2 <= n <= 58
 *
 * @author 51465
 */
public class Offer14_1 {
    public static void main(String[] args) {
        Offer14_1 offer14_1 = new Offer14_1();
        int i = offer14_1.cuttingRope(43);
        System.out.println(i);
    }

    /**
     * 反正就是等分最好
     * 这个乘积都是呈现类似正态分布的，所以只要有开始变小的趋势，它就是最大值了
     * ①将n等分成m份  x = n / m     y = n - x * (m - 1)
     *     1.如果能整除,那就是x的m次方
     *     2.如果不能整除,那就是x的m-1次方再乘上y
     * ②终止条件,就是变小趋势的开始
     * ③y不能是x的整数倍
     *
     * @param n 绳子的长度
     * @return 绳子剪完之后的最大乘积
     */
    public int cuttingRope(int n) {
        if (n <= 3){
            return n - 1;
        }
        int a = 0,b = 1,m = 2;
        //这样都是分成了m+1份
        while (m <= n / 2 + 1){
            int x = n / m,y = n - x * (m - 1);
            if (b > a){
                a = b;
            }
            b = (int) Math.pow(x, m - 1) * y;
            while (y > x){
                int temp = 0;
                if ((y - m + 1) != 0){
                    if ((x + 1) % (y - m + 1) != 0 && y - m + 1 > 0){
                        y = y - m + 1;
                        x = x + 1;
                        temp = (int) Math.pow(x, m - 1) * y;
                    }else {
                        break;
                    }
                    if (temp > b) {
                        b = temp;
                    }
                }else{
                    break;
                }
            }
            m++;
        }
        return a;
    }

    public int cuttingRope1(int n) {
        if(n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if(b == 0) {
            return (int)Math.pow(3, a);
        }
        if(b == 1) {
            return (int)Math.pow(3, a - 1) * 4;
        }
        return (int)Math.pow(3, a) * 2;
    }


}
