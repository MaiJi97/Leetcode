## Method 1: DFS / Divide and Conquer through recursion

Same approach as in problem 105, difference is that we are given postorder instead of preorder so we have to traverse from the end of
postorder array. Note that now the order is [left child, right child, root], so method will be called recursively first on right child
and then on left child.

Time Complexity: O(n)
