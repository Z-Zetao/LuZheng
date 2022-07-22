package pointToOffer.offer31_40;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @author 51465
 */
public class Offer39 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        Offer39 offer39 = new Offer39();
        System.out.println(offer39.majorityElement(nums));

    }

    /**
     * 投票法:很厉害的，多回看leetcode中的方法
     * @param nums
     * @return
     */
    public int majorityElementB(int[] nums) {
        int x = 0, votes = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        return x;
    }

    /**
     * 用hashmap计数
     * @param nums
     * @return
     */
    public int majorityElementA(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        int ans = nums[0];
        for (int num : nums) {
            if (!integerIntegerHashMap.containsKey(num)) {
                integerIntegerHashMap.put(num, 1);
            } else {
                integerIntegerHashMap.replace(num, integerIntegerHashMap.get(num) + 1);
                if (integerIntegerHashMap.get(num) > nums.length / 2){
                    ans = num;
                }
            }
        }
        return ans;
    }



    public int majorityElement(int[] nums) {
        int ans = nums[0] , temp = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length / 2 + 1; i++) {
            int count = 1;
            if (set.contains(nums[i])){
                continue;
            }else {
                set.add(nums[i]);
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i]){
                        count++;
                    }
                }
                if (count > temp){
                    ans = nums[i];
                    temp = count;
                }
                if (temp > nums.length / 2){
                    break;
                }
            }

        }
        return ans;
    }
}
