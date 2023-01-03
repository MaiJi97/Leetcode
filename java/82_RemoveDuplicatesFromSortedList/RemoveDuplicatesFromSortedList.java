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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode current = head;
        while (current != null) {
            if (current.next != null && current.val == current.next.val) { // skip all the duplicate
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                current = current.next; // update current
                prev.next = current; // point prev to current
            }
            else { // only needs to update pointers
                prev = prev.next;
                current = current.next;
            }
        }
        return dummy.next;
    }
}
