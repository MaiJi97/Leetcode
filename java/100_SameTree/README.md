## Method 1: DFS / Divide and Conquer through recursion

Two trees are same if the following two conditions satisfy:

1) The value on the current node are equal
2) The left tree and right tree of the current node are equal. Call the method recursively to verify this.

Time Complexity: O(n)
