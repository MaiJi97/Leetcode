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
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            hm.put(current.val, hm.getOrDefault(current.val, 0) + 1);
            current = current.next;
        }
        ListNode dummy = new ListNode(-1, head);
        current = dummy;
        while (current != null) {
            if (current.next != null && hm.get(current.next.val) > 1) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}
