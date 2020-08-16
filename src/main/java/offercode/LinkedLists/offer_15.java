package offercode.LinkedLists;

import offercode.LinkedLists.offer_05;

import java.util.Stack;

public class offer_15 {

    /**
     * 链表中倒数第k个节点
     * 输入一个链表，输出该链表中倒数第k个结点。
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
        System.out.println(FindKthToTail(node,2).val);
    }

    public static ListNode FindKthToTail(ListNode head, int k) {

        if(head==null || k==0) return null;
        Stack<ListNode> sta = new Stack<ListNode>();
        while(head!=null){
            sta.push(head);
            head=head.next;
        }
        while(sta.size()<k) return null;

        while(k>1){
            sta.pop();
            k--;
        }
        return sta.pop();
    }
}
