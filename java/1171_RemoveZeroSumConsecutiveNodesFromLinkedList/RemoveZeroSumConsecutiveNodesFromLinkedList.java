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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        HashMap<Integer, ListNode> hm = new HashMap<>();
        hm.put(0, dummy);
        ListNode current = dummy;
        int prefix = 0;
        while (current != null) {
            prefix += current.val;
            hm.put(prefix, current); // only keep the latest node with the value
            current = current.next;
        }
        
        current = dummy;
        prefix = 0;
        while (current != null) {
            prefix += current.val;
            current.next = hm.get(prefix).next;
            current = current.next;
        }
        return dummy.next;
    }
}
