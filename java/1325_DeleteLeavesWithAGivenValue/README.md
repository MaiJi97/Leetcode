## Method 1: DFS / Divide and Conquer

Base case is when the tree is null, then return it. If not, call the method recursively to look for an delete the target nodes from the subtrees. We check the current node has target value and set it to null after we call the method recursively. 

Time Complexity: O(n)
