## Method 1: DFS / Traverse through recursion

This problem is to find all possible paths and is usually solved by DFS and backtracking. In the DFS method we continue to explore each path until the path
we construct so far reaches the target. It is the base case where we start to backtrack by removing the last element from a path. 

Time Complexity: O(2^N * N)

If there are a total of N nodes in the graph, there are 2^(N-1)-1 paths, and each path takes O(N) to traverse.

