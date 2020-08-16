package offercode.LinkedLists;

import java.util.HashSet;

public class offer_57 {

    /**
     * 删除链表中的重复节点
     * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
     * 重复的结点不保留，返回链表头指针。
     * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
     */

    public static void main(String[] args) {

    }

    public ListNode deleteDuplication(ListNode pHead) {

        if (pHead == null) return null;
        HashSet<Integer> hashSet = new HashSet<Integer>();

        ListNode pre = pHead;
        ListNode cur = pHead.next;

        while (cur != null) {
            if (cur.val == pre.val) hashSet.add(cur.val);
            pre = cur;
            cur = cur.next;
        }

        while (pHead!=null && hashSet.contains(pHead.val)) {
            pHead = pHead.next;
        }
        if (pHead == null) return null;

        pre = pHead;
        cur = pHead.next;
        while (cur!=null) {
            if (hashSet.contains(cur.val)) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return pHead;
    }
}
