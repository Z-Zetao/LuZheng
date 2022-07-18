package pointToOffer.offer31_40;

import java.util.*;

/**
 * 请实现一个函数按照之字形顺序打印二叉树，
 * 第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 * @author 51465
 */
public class Offer32_3 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);

        TreeNode rootLeft = new TreeNode(9);
        root.left = rootLeft;

        TreeNode rootRight = new TreeNode(20);
        root.right = rootRight;

        TreeNode rootRightLeft = new TreeNode(15);
        rootRight.left = rootRightLeft;

        TreeNode rootRightRight = new TreeNode(7);
        rootRight.right = rootRightRight;
        Offer32_3 offer32_3 = new Offer32_3();
        List<List<Integer>> list = offer32_3.levelOrder(root);
        System.out.println(list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        if (root != null){
            stack1.add(root);
        }
        int i = 1;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            ArrayList<Integer> integers = new ArrayList<>();
            if (i % 2 == 0){
                for (int j = stack2.size(); j > 0; j--) {
                    TreeNode poll = stack2.pop();
                    integers.add(poll.val);
                    if (poll.right != null){
                        stack1.add(poll.right);
                    }
                    if (poll.left != null){
                        stack1.add(poll.left);
                    }
                }
            }
            if (i % 2 == 1){
                for (int j = stack1.size(); j > 0; j--) {
                    TreeNode poll = stack1.pop();
                    integers.add(poll.val);
                    if (poll.left != null){
                        stack2.add(poll.left);
                    }
                    if (poll.right != null){
                        stack2.add(poll.right);
                    }
                }
            }
            list.add(integers);
            i++;
        }
        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
