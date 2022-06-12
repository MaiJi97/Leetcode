## Method 1: BFS / Level Order Traverse through Queue
The only difference with Leetcode 102 is we use a stack to store the result for each level and then pop them into a list in the end, so we can get the reverse order of an ordinary level order traversal.

Time Complexity: O(n)
