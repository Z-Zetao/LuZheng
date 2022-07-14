package pointToOffer.offer21_30;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 *
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 * @author 51465
 */
public class Offer22 {

    /**
     * 双指针
     * 将temp指针指向第k个元素
     * 然后head和temp指针同时向后遍历,直到temp指向最后一个元素
     * 返回head
     *
     * @param head 头指针
     * @param k 倒数第k个元素
     * @return 倒数第k个元素的头指针
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        //将temp和head之间相距k
        for (int i = 0; i < k - 1; i++) {
            if (temp.next != null){
                temp = temp.next;
            }
        }
        //两个指针同时向后移直到temp指向最后一个元素
        while (temp.next != null){
            head = head.next;
            temp = temp.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
