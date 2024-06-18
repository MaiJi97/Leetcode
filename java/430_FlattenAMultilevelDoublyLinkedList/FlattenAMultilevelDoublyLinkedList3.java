/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        Node prev = null;
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (prev != null) {
                prev.next = current;
                current.prev = prev;
            }
            prev = current;
            if (current.next != null) {
                stack.push(current.next);
                current.next = null;
            }
            if (current.child != null) {
                stack.push(current.child);
                current.child = null;
            }
        }
        return head;
    }
}
