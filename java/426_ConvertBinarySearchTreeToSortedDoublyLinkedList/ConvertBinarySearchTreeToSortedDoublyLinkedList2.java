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

    Node prev = null;
    Node first = null;

    public Node treeToDoublyList(Node root) { // in order traversal, BST 从小到大
        if (root == null) return root;
        inOrder(root);
        prev.right = first;
        first.left = prev;
        return first;
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        if (first == null) first = root; // at the beginning
        if (prev != null) { // if not at the beginning
            prev.right = root;
            root.left = prev;
        }
        prev = root;
        inOrder(root.right);
    }
}
