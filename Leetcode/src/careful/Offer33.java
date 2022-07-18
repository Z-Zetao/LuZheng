package careful;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
 * 如果是则返回 true，否则返回 false。
 * 假设输入的数组的任意两个数字都互不相同。
 * @author 51465
 */
public class Offer33 {
    public static void main(String[] args) {
        int[] ints = {4, 8, 6, 12, 16, 14, 10};
        Offer33 offer33 = new Offer33();
        System.out.println(offer33.verifyPostorder(ints));
    }

    /**
     * 三个数之中,第一个数必须是最小的,否则就没办法形成顺序树
     * @param postorder 后续遍历的结果
     * @return 是否能形成顺序树
     */
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    /**
     * 根结点一定在最后面,左子树必须都小于根结点,右子树必须都大于根结点
     * @param postorder
     * @param i
     * @param j
     * @return
     */
    boolean recur(int[] postorder, int i, int j) {
        if(i >= j) {
            return true;
        }
        int p = i;
        while(postorder[p] < postorder[j]) {
            p++;
        }
        int m = p;
        while(postorder[p] > postorder[j]) {
            p++;
        }
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }
}
