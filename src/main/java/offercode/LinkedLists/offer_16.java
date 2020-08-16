package offercode.LinkedLists;


import offercode.LinkedLists.offer_05;

public class offer_16 {

    /**
     * 反转链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public static void main(String[] args) {

        ListNode node = new ListNode(0);
        ListNode l1= new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        node.next = l1;
        node.next.next = l2;
        node.next.next.next = l3;
        node.next.next.next.next = l4;
        System.out.println(ReverseList(node).val);

    }

    public static ListNode ReverseList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode pre = null;
        ListNode nex = null;

        while(head!=null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
}
