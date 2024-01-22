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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode current = head;
        ListNode prev = dummy;
        
        while (current != null && current.next != null) {
            ListNode nextPair = current.next.next; // start of next pair
            ListNode second = current.next; // second node of the current pair
            
            second.next = current;
            current.next = nextPair;
            prev.next = second;
            
            prev = current;
            current = nextPair;            
        }
        return dummy.next;
    }
}
