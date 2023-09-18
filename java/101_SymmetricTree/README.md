## Method 1: DFS / Divide and Conquer through recursion

Implement same tree method in problem 100 as a helper method. Two trees are symmetric if the following two conditions satisfy:

1) The value on the current node are equal
2) The left tree and right tree of the current node are symmetric - left tree of p equals right tree of q, and right tree of p equals
left tree of q. Call the method recursively to verify this.

Time Complexity: O(n)
