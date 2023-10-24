## Method 1: DFS / Divide and Conquer through recursion

We need a helper function that takes in additional parameters, which are the current path and the path list. The helper method does not return anything (void) as we modify the current path and the result list directly. Each path is concatenated from an empty string and is added to the result list when it's done. Then, call the method recursively on its left child and right child respectively to merge the two. </br></br>

Note that the final result list can also be stored as a global variable.

Time Complexity: O(n)

