## Method 1: DFS / Traverse through recursion - backtracking

To ensure all the characters are unique, we can use a hash set to store all the characters we have so far. We have a helper method 
that takes in parameters regarding the current state, including the hash set and an index up to which string in the given input we 
have visited. In the helper method, always update the length of the longest concatenated string, and break the recursion when we have 
visited all the strings in the input. Return is void as we just need to update the length. Else we try to add the string at current 
index to the hash set (if possible) and call the method recursively on the next index no matter if or not we count the string at current
index. After the recursive call, if we count the string at current index, we need to take one step back and remove the characters we added
from the current string from the hash set to allow the pick up of other options.

Time Complexity: O(2 ^ n) where n is the length of arr, since each string could be concatenated or not.
