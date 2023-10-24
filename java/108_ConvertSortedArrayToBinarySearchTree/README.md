## Method 1: DFS / Divide and Conquer through recursion

Combine the problem with binary search approach. Since the array is ordered, each time we pick the mid element and convert it to a 
tree node, then do the same on the subarray to the left and subarray to the right to form the left subtree and right subtree. We need a separate helper method which takes in extra information (boundary values of the subtree to be generated). The helper method has the same return type as the main method.

Time Complexity: O(n)
