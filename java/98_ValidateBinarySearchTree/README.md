## Method 1: DFS through recursion

Note that to satisfy the condition for a BST, both left subtree and right subtree have to be BST. In addition, all the elements on the left of the root has
to be smaller than the root and all the elements on the right of the root has to be greater than the root. So we needs to take in additional information 
which is a range for the value that left subtree / right subtree can take when checking if they satisify the conditions of BST. 

Time Complexity: O(n)
