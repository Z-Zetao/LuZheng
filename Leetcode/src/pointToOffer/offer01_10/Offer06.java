package pointToOffer.offer01_10;

import java.util.Stack;

/**
 * 栈的输出
 * @author 51465
 */
public class Offer06 {
    public static void main(String[] args) {

    }


    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
