## Method 1 & 2: DFS / Traverse through recursion - backtracking

For method 1, it is similar as the subset problems, but instead of finding all possible subsets we only need to get the number of subsets so we do not need to track 
the list of list. The other difference is that we need to ensure the subset is beautiful, which is why we use a hash map instead. Hash set won't work because there 
can be duplicate.

For method 2, it uses another way in backtracking, add and remove in main body of the method instead of in a loop.

Time Complexity: O(2 ^ n)
