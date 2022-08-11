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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        while (k % length > 0) {
            head = rotate(head);
            k--;
        }
        return head;
    }
    
    public ListNode rotate(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null && current.next != null) {
            prev = current;
            current = current.next;
        }
        
        current.next = head;
        prev.next = null;
        return current;      
    }
}
