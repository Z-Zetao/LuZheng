package pointToOffer.Offer01_10;

/**
 * @author 51465
 */
public class Offer10_1 {

    public static void main(String[] args) {
        int fib = new Offer10_1().fib1(7);
        System.out.println(fib);
    }


    /**
     * 递归
     * @param n
     * @return
     */
    public int fib(int n) {
        int result;
        if(n == 0){
            result = 0;
        }else if(n == 1){
            result = 1;
        }else{
            result = fib(n-1) + fib(n-2);
        }
        return result % 1000000007;
    }

    /**
     * 非递归
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n == 0 || n == 1){
            return n % 1000000007;
        }
        int a = 0;
        int b = 1;
        for (int i = 2;i <= n;i++){
            int temp = b;
            b = (a + b) % 1000000007;
            a = temp;
        }
        return b;
    }

    /**
     * 非递归
     * @param n
     * @return
     */
    public int fib2(int n) {
        int a = 0;
        int b = 1;
        int sum;
        for (int i = 0;i < n;i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }


}
