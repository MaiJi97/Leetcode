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
        Node current = null;
        Node first = null;
        while (!stack.isEmpty()) {
            Node root = stack.pop();
            if (first == null) first = root;
            if (current != null) {
                current.next = root;
                root.prev = current;
            }
            current = root;
            if (current.next != null) {
                stack.push(current.next);
            }
            if (current.child != null) {
                stack.push(current.child);
                current.child = null;
            }
        }
        return first;
    }
}
