package pointToOffer.offer21_30;

import java.util.Stack;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * @author 51465
 */
public class Offer23 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        Offer23 offer23 = new Offer23();
        ListNode listNode1 = offer23.reverseList(listNode);
        System.out.println(listNode1);
    }

    /**
     * 也就是运用两个指针
     * 1指针指向头节点,2指针指向null
     * 当头节点不为空的时候:先保留头节点的后一个节点3指针,然后将1指针指向null,然后2指针来到头节点的位置,1指针指向3指针的位置
     * 依次类推,直到1指针指向null,然后返回2指针
     *
     * 双指针做法特别厉害
     */
    public ListNode reverseListAnswer(ListNode head) {
        ListNode cur = head, pre = null;
        while(cur != null) {
            // 暂存后继节点 cur.next
            ListNode tmp = cur.next;
            // 修改 next 引用指向
            cur.next = pre;
            // pre 暂存 cur
            pre = cur;
            // cur 访问下一节点
            cur = tmp;
        }
        return pre;
    }

    /**
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode formatHead = head;
        //栈就是先进后出,所以就刚好符合要求
        Stack<Integer> stack = new Stack<>();
        //将元素全都弄进去
        while (formatHead.next != null){
            stack.push(formatHead.val);
            formatHead = formatHead.next;
        }
        //因为最后一个元素它出不来,所以需要再添加一次
        stack.push(formatHead.val);
        ListNode temp = head;
        while (!stack.empty()){
            temp.val = stack.pop();
            temp = temp.next;
        }
        return head;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
