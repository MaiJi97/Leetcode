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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode prev = null;
        ListNode current = head;
        
        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        
        ListNode connection = prev;
        ListNode tail = current;
        
        while (right > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }
        
        if (connection != null) {
            connection.next = prev;
        }
        else {
            head = prev;
        }
        tail.next = current;
        return head;
    }
}
