/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {

    Node first = null;
    Node prev = null;
    
    public Node treeToDoublyList(Node root) { // in order traversal, BST 从小到大
        if (root == null) return null;

        Stack<Node> stack = new Stack<>();

        Node current = root;
        Node first = null;
        Node prev = null;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (first == null) first = current;
            if (prev != null) {
                current.left = prev;
                prev.right = current;
            }
            prev = current;
            current = current.right;
        }
        prev.right = first;
        first.left = prev;
        return first; 
    }
}
