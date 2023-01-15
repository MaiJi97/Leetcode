## Method 1: DFS / Traverse through recursion

Same as problem 46 Permutation I, but we want to eliminate all the duplicate permutations. For example, if nums is [1, 2, 2], we only want to use one of the duplicate 2's and call the method recusively on the rest of the elements since [1, 2(1), 2(2)] and [1, 2(2), 2(1)] are counted as the same. Also we would want to count those permutations with both 2's in them such as [1, 2, 2]. We can use a hash map to store each number in the nums array and the number of occurrences of each number. Then for DFS we iterate through each number (key) in the hash map, add the number to the current permutation and decrement its number of occurrences in the hash map, then recursively call the method if the number of occurrences is still more than 0 (the number appears more than once). 

Time Complexity: O(n!)
