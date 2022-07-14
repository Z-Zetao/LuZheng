package pointToOffer.offer21_30;

import careful.Offer20;

import java.util.Arrays;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 *
 * @author 51465
 */
public class Offer21 {
    public static void main(String[] args) {
        Offer21 offer21 = new Offer21();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] exchange = offer21.exchange(ints);
        System.out.println(Arrays.toString(exchange));
    }

    /**
     * 双指针:一个指向第一个,一个指向最后一个,当前面指针的索引>后面指针的索引就停止
     * 前面的指针找偶数,后面的指针找奇数
     * @param nums 待调整的数组
     * @return 调整后的数组
     */
    public int[] exchange(int[] nums) {
        int i = 0,j = nums.length - 1;
        while (i < j){
            if (nums[i] % 2 != 0){
                i++;
                continue;
            }
            if (nums[j] % 2 != 1){
                j--;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
