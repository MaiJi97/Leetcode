## Method 1: DFS / Divide and Conquer through recursion

We could learn from the given preorder traversal the root element, and its direct children which are the next roots, and so on. We 
just need to make use of the given inorder traversal and find the position of the root element, then recursively call the method to
construct the left subtree and right subtree of the current root. Therefore, we can use a hash map to record the node value and its
index so that we can look up the current node from the preorder array in the inorder array. 

Time Complexity: O(n)
