package pointToOffer;

import java.util.HashSet;

/**
 * 寻找数组中的重复数字
 * @author 51465
 */
public class Offer03 {
    public static void main(String[] args) {
        int[] ints = {3, 1, 2, 3};
        Offer03 offer03 = new Offer03();
        int repeatNumberAnswer = offer03.findRepeatNumberAnswer(ints);
//        int repeatNumber = offer03.findRepeatNumber(ints);
        System.out.println(repeatNumberAnswer);
    }

    public int findRepeatNumber(int[] nums){
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    ans = nums[i];
                    break;
                }
            }
            if (ans != 0){
                break;
            }
        }
        return ans;
    }

    /**
     * 哈希表中不能加入重复数字——所以用哈希表进行操作
     * @param nums 输入数组
     * @return 重复数字
     */
    public int findRepeatNumberAnswer(int[] nums){
        HashSet<Integer> integers = new HashSet<>();
        for (Integer i : nums) {
            if (integers.contains(i)){
                return i;
            }
            integers.add(i);
        }
        return -1;
    }

}
