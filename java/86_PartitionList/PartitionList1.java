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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode dummy1Pointer = dummy1;
        ListNode dummy2Pointer = dummy2;
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                dummy1Pointer.next = new ListNode(current.val);
                dummy1Pointer = dummy1Pointer.next;
            }
            else {
                dummy2Pointer.next = new ListNode(current.val);
                dummy2Pointer = dummy2Pointer.next;
            }
            current = current.next;
        }
        dummy2Pointer.next = null;
        dummy1Pointer.next = dummy2.next;
        return dummy1.next;
    }
}
