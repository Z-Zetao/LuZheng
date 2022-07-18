package pointToOffer.offer21_30;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 *
 * @author 51465
 */
public class Offer25 {
    public static void main(String[] args) {

    }


    /**
     * 将两个升序链表组合成一个升序链表
     * @param l1 链表l1
     * @param l2 链表l2
     * @return 升序链表的头节点
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){return l2;}
        if (l2 == null){return l1;}
        //开辟一个新的链表用来存储输出的链表
        ListNode ans = null;
        //先看看以哪一个链表为输出节点
        if (l1.val <= l2.val){
            ans = l1;
            l1 = l1.next;
        }else {
            ans = l2;
            l2 = l2.next;
        }
        ListNode head = ans;
        while (l1 != null || l2 != null){
            if (l1 == null){
                ans.next = l2;
                break;
            }else if (l2 == null){
                ans.next = l1;
                break;
            }else {
                if (l1.val <= l2.val){
                    ans.next = l1;
                    ans = l1;
                    l1 = l1.next;
                }else {
                    ans.next = l2;
                    ans = l2;
                    l2 = l2.next;
                }
            }
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
