package pointToOffer.Offer11_20;

/**
 * @author 51465
 */
public class Offer14_2 {
    public static void main(String[] args) {
        Offer14_2 offer14_2 = new Offer14_2();
        System.out.println(offer14_2.cuttingRope(10));
    }

    /**
     * 这里的重点就是再每次乘上3的时候都有可能越界
     * 所以每次乘上3之后都要进行取模运算才不会超
     * 同时在最后得出答案*4和*2的时候也有可能越界，所以就要先用long进行存储并取模，然后再转int
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        int ans = 0;
        long ansFront = 1;
        if(n <= 3){
            return (n - 1) % 1000000007;
        }
        int a = n / 3,b = n % 3;
        if(b == 0){
            for (int i = 1; i <= a; i++) {
                ansFront = ansFront * 3 % 1000000007;
            }
            ans = (int) ansFront % 1000000007;
        }else if(b == 1){
            for (int i = 1; i <= a - 1; i++) {
                ansFront = ansFront * 3 % 1000000007;
            }
            ansFront = ansFront * 4 % 1000000007;
            ans = (int) ansFront;
        }else{
            for (int i = 1; i <= a; i++) {
                ansFront = ansFront * 3 % 1000000007;
            }
            ansFront = ansFront * 2 % 1000000007;
            ans = (int) ansFront;
        }
        return ans;
    }
}
