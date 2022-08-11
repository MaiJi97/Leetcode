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
        ListNode temp1 = new ListNode(-1, head);
        ListNode temp2 = new ListNode(-1, head);
        ListNode temp1_pointer = temp1;
        ListNode temp2_pointer = temp2;
        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                temp1_pointer.next = current;
                temp1_pointer = temp1_pointer.next;
            }
            else {
                temp2_pointer.next = current;
                temp2_pointer = temp2_pointer.next;
            }
            current = current.next;
        }
        
        temp2_pointer.next = null;
        temp1_pointer.next = temp2.next;
       
        return temp1.next;
    }
}
