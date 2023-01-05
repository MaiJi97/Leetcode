/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node current = head;
        while (current != null) { // add new node after each original node
            Node node = new Node(current.val);
            node.next = current.next;
            current.next = node;
            current = current.next.next;
        }
        current = head;
        while (current != null) { // link the random pointers
            if (current.next != null && current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        current = head;
        Node ret = head.next;
        while (current != null && current.next != null) { // seperate nodes from original list and the copied list
            Node next = current.next;
            current.next = current.next.next;
            current = next;
        }
        return ret;
    }
}
