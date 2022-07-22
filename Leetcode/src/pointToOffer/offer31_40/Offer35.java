package pointToOffer.offer31_40;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 51465
 */
public class Offer35 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        node1.random = node2;
        node2.random = node2;
        Offer35 offer35 = new Offer35();
        Node node = offer35.copyRandomList(node1);
        System.out.println(node);
    }


    public Node copyRandomListAnswer(Node head) {
        if(head == null) {
            return null;
        }
        Node cur = head;
        Map<Node, Node> map = new HashMap<>();
        // 3. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while(cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 4. 构建新链表的 next 和 random 指向
        while(cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        // 5. 返回新链表的头节点
        return map.get(head);
    }

    /**
     * 这个是错误的！
     */
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        //这个是用来存每一个结点的,只为了后面的random可以街上
        int i = 0;
        HashMap<Integer, Node> integerNodeHashMap = new HashMap<>();
        Node temp = head;
        while (temp != null){
            integerNodeHashMap.put(i, new Node(temp.val));
            temp = temp.next;
            i++;
        }
        //真正要复制了
        int j = 1;
        Node node = new Node(head.val);
        Node ans = node;
        while (head.next != null){
            node.next = integerNodeHashMap.get(j);
            if (head.random != null){
                //这里有问题——你这个索引它完全有可能找不到
                node.random = integerNodeHashMap.get(head.random.val);
            }else {
                node.random = null;
            }
            head = head.next;
            node = node.next;
            j++;
        }
        return ans;
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}