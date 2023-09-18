## Method 1: DFS / Divide and Conquer through recursion

The tree is balanced if:
1) The left tree and right tree are both balanced.
2) The difference between heights of left tree and right tree is no more than 1. </br>
   We need a helper function to calculate the height of a tree.

Time Complexity: O(nlogn)
