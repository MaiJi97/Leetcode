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
        Node current = head;
        HashMap<Node, Node> hm = new HashMap<>(); // mapping between nodes in original list and new list
        while (current != null) {
            hm.put(current, new Node(current.val));
            current = current.next;
        }
        current = head;
        while (current != null) {
            hm.get(current).next = hm.get(current.next);
            hm.get(current).random = hm.get(current.random);
            current = current.next;
        }
        return hm.get(head);
    }
}
