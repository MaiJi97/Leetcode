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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> temp = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            temp.add(current.val);
            current = current.next;
        }

        int[] ret = new int[temp.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = temp.size()-1; i >= 0; i--) {
            while (!stack.isEmpty() && temp.get(i) >= stack.peek()) stack.pop();
            ret[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(temp.get(i));
        }
        return ret;
        
    }
}
