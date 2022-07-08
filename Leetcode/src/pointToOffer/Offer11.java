package pointToOffer;

/**
 * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。
 * 请返回旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。
 *

 * @author 51465
 */
public class Offer11 {
    public static void main(String[] args) {
        int[] ints = {3, 1};
        Offer11 offer11 = new Offer11();
        System.out.println(offer11.minArray(ints));
    }

    /**
     * 用双指针进行解决
     * 因为数列一开始是升序排列的,旋转之后,肯定在最大数和最小数之间变成了一个降序
     * 这样就减少了循环次数
     * @param numbers 待寻找最小值的数组
     * @return 数组的最小值
     */
    public int minArray(int[] numbers) {
        int i = 0,j = 1;
        int ans = numbers[0];
        while (i < numbers.length - 1 && j < numbers.length){
            if (numbers[i] > numbers[j]){
                ans = numbers[j];
                break;
            }else {
                i++;
                j++;
            }
        }
        return ans;
    }
}
