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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }
    
    public ListNode merge(ListNode left, ListNode right) {
        ListNode temp = new ListNode(-1);
        ListNode current = temp;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            }
            else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        
        while (left != null) {
            current.next = left;
            left = left.next;
            current = current.next;
        }
        
        while (right != null) {
            current.next = right;
            right = right.next;
            current = current.next;
        }
        return temp.next;
    }
}
