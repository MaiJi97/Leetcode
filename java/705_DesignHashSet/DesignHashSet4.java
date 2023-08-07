class MyHashSet { // with submission error, not sure what is the issue

    private Bucket[] bucketArray;
    private int keyRange;

    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for (int i = 0; i < this.keyRange; i++) {
            this.bucketArray[i] = new Bucket();
        }
    }
    
    public void add(int key) { // O(n/k)
        int index = key % this.keyRange;
        bucketArray[index].add(key);
    }
    
    public void remove(int key) { // O(n/k)
        int index = key % this.keyRange;
        bucketArray[index].remove(key);
    }
    
    public boolean contains(int key) { // O(n/k)
        int index = key % this.keyRange;
        return bucketArray[index].contains(key);
    }
}

class Bucket {
    public BST container;

    public Bucket() {
        this.container = new BST();
    }

    public void add(Integer key) { // O(n)
        this.container.root = this.container.insertNode(this.container.root, key);
    }

    public void remove(Integer key) { // O(n)
        this.container.root = this.container.deleteNode(this.container.root, key);
    }

    public boolean contains(Integer key) { // O(n)
        return this.container.searchBST(this.container.root, key) != null;
        
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode (int val) {
        this.val = val;
    }
}

class BST {
    
    TreeNode root = null;

    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null || this.root.val == key) return root;
        return key < this.root.val ? searchBST(root.left, key) : searchBST(root.right, key);
    }

    public TreeNode insertNode(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (root.val == key) return root;
        else if (key > root.val) root.right = insertNode(root.right, key);
        else if (key < root.val) root.left = insertNode(root.left, key);
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if (key > root.val) root.right = deleteNode(root.right, key);
        else if (key < root.val) root.left = deleteNode(root.left, key);
        else { 
            if (root.left == null && root.right == null) { // node is a leaf
                root = null;
            }
            else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            }
            else {
                root.val = predeccessor(root);
                root.left = deleteNode(root.left, root.val);
            }
        }
        return root;
    }

    public int successor(TreeNode root) { // one step right and then always left
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    public int predeccessor(TreeNode root) { // one step left and then always right
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
