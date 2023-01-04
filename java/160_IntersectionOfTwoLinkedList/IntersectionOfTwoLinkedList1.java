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
        while (headA != null) {
            ListNode pointerB = headB;
            while (pointerB != null) {
                if (headA == pointerB) return pointerB;
                pointerB = pointerB.next;
            }
            headA = headA.next;
        }
        return null;
    }
}
