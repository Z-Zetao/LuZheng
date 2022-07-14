package pointToOffer.offer11_20;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * @author 51465
 */
public class Offer18 {
    public static void main(String[] args) {
    }



    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val){
            return head.next;
        }else {
            //这个是用来记录头指针的
            ListNode first = head;
            //这两个是用来找到所要删除的值的
            ListNode temp = head;
            head = head.next;
            //让head指向要删除的值
            while (head.val != val){
                temp = head;
                head = head.next;

            }
            //将值删除
            temp.next = head.next;
            return first;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
