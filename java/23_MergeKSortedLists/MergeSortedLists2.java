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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode l : lists) {
            if (l != null) pq.offer(l);
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(!pq.isEmpty()) {
            current.next = pq.poll();
            current = current.next;
            if(current.next != null) pq.offer(current.next);
        }
        return dummy.next;
    }
}
