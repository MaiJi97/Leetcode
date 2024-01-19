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
        Node dummy = new Node();
        Node prev = dummy;
        while (!stack.isEmpty()) {
            Node current = stack.pop(); // current is the node we are at
            prev.next = current; // these two lines connect the current node and the previous node in correct order
            current.prev = prev;
            prev = current; // update the previous node to be the node we are at
            if (current.next != null) {
                stack.push(current.next);
            }
            if (current.child != null) {
                stack.push(current.child);
                current.child = null;
            }
        }
        Node ret = dummy.next;
        dummy.next = null;
        ret.prev = null;
        return ret;
    }
}
