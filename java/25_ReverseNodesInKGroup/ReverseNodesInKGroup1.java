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
        int N = countLength(head);
        int i = 1;
        while (i + k <= N + 1) {
            head = reverseBetween(head, i, i+k-1);
            i += k;
        }
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        while (left > 1) {
            prev = current;
            current = current.next;
            left--;
            right--;
        }
        ListNode start = current; // 2
        ListNode beforeStart = prev; // 1
        while (right > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            right--;
        }
        ListNode afterEnd = current; // 5
        ListNode end = prev; // 4
        if (beforeStart != null) { // If reverse not starts from the first node
            beforeStart.next = end;
        }
        else { // If reverse starts from the first node
            head = prev;
        }
        start.next = afterEnd;
        return head;
    }

    public int countLength(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}
