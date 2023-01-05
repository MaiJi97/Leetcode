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
    public Node treeToDoublyList(Node root) { // in order traversal, BST 从小到大
        if (root == null) return root;
        Node current = null;
        Node first = null;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();

            if (first == null) first = root; // at the beginning
            if (current != null) { // if not at the beginning
                current.right = root;
                root.left = current;
            }
            current = root;

            root = root.right;
        }
        current.right = first;
        first.left = current;
        return first;
    }
}
