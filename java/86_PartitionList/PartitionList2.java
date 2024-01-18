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
        // if we do not want to use additional space 
        ListNode dummy1 = new ListNode(-1, head);
        ListNode dummy2 = new ListNode(-1, head);
        ListNode dummy1_pointer = dummy1;
        ListNode dummy2_pointer = dummy2;
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                dummy1_pointer.next = current;
                dummy1_pointer = dummy1_pointer.next;
            }
            else {
                dummy2_pointer.next = current;
                dummy2_pointer = dummy2_pointer.next;
            }
            current = current.next;
        }
        
        dummy2_pointer.next = null;
        dummy1_pointer.next = dummy2.next;
       
        return dummy1.next;
    }
}
