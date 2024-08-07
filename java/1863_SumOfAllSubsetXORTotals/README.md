## Method 1: DFS / Traverse through recursion - backtracking (?)

Similar as the subset problems, but instead of finding all possible subsets we only need the sum and calling the method recursively will not be affected by the current visit. So in this case can just use a traditional DFS and do not need to do the add and remove steps.

While logic is still same as in subset problems,  we do recursive call in a for loop - 通过for loop对后面的每一个对象进行操作。

Time Complexity: O(2 ^ n) 

## Method 2: DFS / Traverse through recursion

The other way is to do recursive call in the main body of the method instead of in a for loop - 对当前对象进行操作。

Though it would be good to record existing results obtained by recursion, the memoization here will be a 2D array since there are two attributes to take into account - index and current sum. 

Time Complexity: O(2 ^ n) 

## Method 3: DFS / Traverse through recursion

Same as method 2, just change the return type to integer directly.

Time Complexity: O(2 ^ n) 
