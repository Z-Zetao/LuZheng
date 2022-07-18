package careful;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

/**
 * @author 51465
 */
public class Offer32_1 {
    /**
     * 考的是广度优先遍历
     * 二叉树是:
     * [A,B,C,D,E,F,G,H,I]
     *
     * 首先将A节点插入队列中，queue(A);
     *
     * 将A节点弹出，同时将A的子节点B，C插入队列中，此时B在队列首，C在队列尾部，queue(B，C)；
     *
     * 将B节点弹出，同时将B的子节点D，E插入队列中，此时C在队列首，E在队列尾部，queue(C，D，E);
     *
     * 将C节点弹出，同时将C的子节点F，G，H插入队列中，此时D在队列首，H在队列尾部，queue(D，E，F，G，H)；
     *
     * 将D节点弹出，D没有子节点，此时E在队列首，H在队列尾部，queue(E，F，G，H)；
     *
     * ...依次往下
     */


    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int i = 0;
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            hashMap.put(i,poll.val);
            i++;
            if (poll.left != null){
                queue.add(poll.left);
            }
            if (poll.right != null){
                queue.add(poll.right);
            }
        }
        int[] ans = new int[hashMap.size()];
        for (int j = 0; j < i; j++) {
            ans[j] = hashMap.get(j);
        }
        return ans;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
