package offercode.LinkedLists;

public class offer_56 {

    /**
     * 链表中环的入口节点
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     * ### 如果链表中存在环，经过多次循环之后.next和.next.next会重合
     * 链表中的环一定在链表结尾（一个指针只能指向一个地址，一个地址可以被多个指针指向）
     */

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode l2= new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        node.next = l2;
        node.next.next = l3;
        node.next.next.next = l4;
        node.next.next.next.next = l5;
        node.next.next.next.next.next = l6;
        node.next.next.next.next.next.next = l7;
        node.next.next.next.next.next.next.next = l8;
        node.next.next.next.next.next.next.next.next = l3;

        System.out.println(EntryNodeOfLoop(node).val);
    }

    public static ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        ListNode l=pHead, r=pHead;
        boolean flag = false;
        // 找到环
        while (r!=null && r.next!=null) {
            l = l.next;
            r = r.next.next;
            if (l==r) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            return null;
        } else {
            // 得到环中的节点数目
            int n = 1;
            r = r.next;
            while (l!=r) {
                r=r.next;
                n++;
            }
            // 找到环中的入口节点
            l = r = pHead;
            for (int i = 0; i < n; i++) {
                r = r.next;
            }
            while (l != r) {
                l = l.next;
                r = r.next;
            }
        }
        return l;
    }
}
