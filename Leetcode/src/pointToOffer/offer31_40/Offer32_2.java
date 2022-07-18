package pointToOffer.offer31_40;

import java.util.*;

/**
 * @author 51465
 */
public class Offer32_2 {
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
        Offer32_2 offer32_2 = new Offer32_2();
        List<List<Integer>> list = offer32_2.levelOrder(root);
        System.out.println(list);

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();
        queue2.add(root);
        while (!queue2.isEmpty()){
            ArrayList<Integer> integers = new ArrayList<>();
            //这里要把queue2给queue1;
            while (!queue2.isEmpty()){
                integers.add(queue2.peek().val);
                queue1.add(queue2.poll());
            }
            list.add(integers);
            while (!queue1.isEmpty()){
                TreeNode poll = queue1.poll();
                if (poll.left != null){
                    queue2.add(poll.left);
                }
                if (poll.right != null){
                    queue2.add(poll.right);
                }
            }
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
