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
        flattenTail(head);
        return head;
    }
    private Node flattenTail(Node head) {
        Node current = head;
        Node tail = head;
        while (current != null) {
            Node child = current.child;
            Node next = current.next;
            if (child != null) {
                tail = flattenTail(child);
                current.next = child;
                child.prev = current;
                current.child = null;
                tail.next = next;
                if (next != null) next.prev = tail;
                current = tail;
            }
            else {
                current = next;
            }
            if (current != null) tail = current;   
        }
        return tail;
    }

}
