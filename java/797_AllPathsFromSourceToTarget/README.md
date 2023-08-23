## Method 1: DFS / Backtracking

This problem is to find all possible paths and is usually solved by DFS and backtracking. DFS as a separate method as it takes in additional information regarding the current state. In the helper method, break the recursion when we complete traversing a whole path to the target, no return as we just need to add the current traversed path to the final result. In the body we recursively explore next step in the path until the path we construct so far reaches the target, and then we start to backtrack by removing the last element from a path. 

Time Complexity: O(2^N * N)

If there are a total of N nodes in the graph, there are 2^(N-1)-1 paths, and each path takes O(N) to traverse.

