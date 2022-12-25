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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current = head;
        int count = 0;
        while (count < k) { // bypass the first k elements
            if (current == null) {
                return head;
            }
            current = current.next;
            count++;
        }
        ListNode reversed = reverse(head, k); // reverse the first k elements
        ListNode rest = reverseKGroup(current, k); // refer to problem 92, this is the afterEnd node
        head.next = rest; // refer to problem 92, link start node with afterEnd node
        return reversed; // refer to problem 92, return the end node
    }

    public ListNode reverse(ListNode head, int k) { // reverse first k elements and return only the first k elements
        ListNode current = head;
        ListNode prev = null;
        while (k > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current; 
            current = next;
            k--;
        }
        return prev;
    }
}
