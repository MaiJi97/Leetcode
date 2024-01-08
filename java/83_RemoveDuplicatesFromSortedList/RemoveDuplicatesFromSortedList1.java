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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
}

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode current = head;
//         while (current != null) {
//             while (current.next != null && current.next.val == current.val) {
//                 current.next = current.next.next;
//             }
//             current = current.next;
//         }
//         return head;
//     }
// }
