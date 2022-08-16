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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ret = new ListNode[k];
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        
        int size = count / k;
        int extra = count % k;

        current = head;
        ListNode prev = null;
        
        for (int i = 0; i < k; i++) {
            ret[i] = current;
            if (current == null) {
                continue;
            }
            int target = size + (i < extra ? 1 : 0);
            
            while (current != null && target > 0) {
                prev = current;
                current = current.next;
                target--;
            }
            prev.next = null;
        }
        return ret;
    }
}
