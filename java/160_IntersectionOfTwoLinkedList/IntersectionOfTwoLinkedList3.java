/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        return lenA >= lenB ? helper(headA, headB, lenA-lenB) : helper(headB, headA, lenB-lenA);
    }

    public int getLength(ListNode head) {
        ListNode current = head;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public ListNode helper(ListNode headA, ListNode headB, int diff) {
        while (diff > 0) {
            headA = headA.next;
            diff--;
        }
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
