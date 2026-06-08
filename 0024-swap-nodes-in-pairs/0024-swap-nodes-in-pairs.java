/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
         ListNode nun = new ListNode(0, head);
        ListNode prev = nun, cur = head;

        while (cur != null && cur.next != null) {
            ListNode n = cur.next.next;
            ListNode second = cur.next;

            second.next = cur;
            cur.next = n;
            prev.next = second;

            prev = cur;
            cur = n;
    }
    return nun.next;
}
}