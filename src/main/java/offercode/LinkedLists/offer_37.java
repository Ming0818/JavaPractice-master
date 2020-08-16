package offercode.LinkedLists;

public class offer_37 {

    /**
     * 两个链表的第一个公共节点
     * 输入两个链表，找出它们的第一个公共结点。
     * （注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
     * 遍历两遍这两个链表，如果有重复的节点，那么一定能够使遍历的指针相等。
     */

    public static void main(String[] args) {

        ListNode node1 = new ListNode(0);
        ListNode l2= new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        node1.next = l2;
        node1.next.next = l3;
        node1.next.next.next = l4;
        node1.next.next.next.next = l5;
        node1.next.next.next.next.next = l6;

        ListNode node2 = new ListNode(7);
        ListNode l20= new ListNode(8);
        ListNode l30 = new ListNode(4);
        ListNode l40 = new ListNode(5);
        node2.next = l20;
        node2.next.next = l30;
        node2.next.next.next = l40;

        /*ListNode p = node1;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }*/
        System.out.println(FindFirstCommonNode(node1, node2).val);

    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        if (pHead1==null || pHead2==null) return null;

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1.val != p2.val) {
            p1 = p1.next;
            p2 = p2.next;
            if (p1 != p2) {
                if (p1 == null) p1 = pHead2;
                if (p2 == null) p2 = pHead1;
            }
        }
        return p1;
    }
}
