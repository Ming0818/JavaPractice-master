package offercode.LinkedLists;

import offercode.LinkedLists.offer_05;

public class offer_17 {

    /**
     * 合并两个排序的链表
     * 输入一个链表，反转链表后，输出新链表的表头。
     */

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode l1= new ListNode(3);
        ListNode l2 = new ListNode(5);

        ListNode n2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(6);
        n1.next = l1;
        //n1.next.next = l2;
        n2.next = l3;
        n2.next.next = l4;

        System.out.println(Merge(n1,n2).toString());

    }

    public static ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode merge = head;

        while(list1!=null && list2!=null){
            if(list1.val>list2.val){
                merge.next = list2;
                list2 = list2.next;
            }else{
                merge.next = list1;
                list1 = list1.next;
            }
            merge = merge.next;
        }

        if(list1!=null) merge.next = list1;
        if(list2!=null) merge.next = list2;

        return head.next;
    }
}
