## Method 1: DFS / Traverse through recursion - backtracking

Similar as the subset problems, but instead of finding all possible subsets we only need the sum. So in this case we do not need to do the add and remove steps. 

Time Complexity: O(2 ^ n) 

## Method 2: DFS / Traverse through recursion

The other way is just a traditional DFS through recursion

Though it would be good to record existing results obtained by recursion, the memoization here will be a 2D array since there are two attributes to take into account - index and current sum. 

Time Complexity: O(2 ^ n) 
