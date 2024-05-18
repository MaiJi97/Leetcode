## Method 1: DFS / Divide and Conquer

Base case is when the tree is null, then return it. If not, call the method recursively on its subtrees and assign the result to the left and right children of current node. We also 
need two helper methods to help us shift the position of the rest of the node when the current node is being removed. Note that this is another example of doing the removal after
the recursive calls.

Time Complexity: O(n)
