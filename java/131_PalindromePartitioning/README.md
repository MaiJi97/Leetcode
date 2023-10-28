## Method 1: DFS / Traverse through recursion - backtracking

We have a helper method that takes in parameters regarding the current state, including the result list and a current list. In the
helper method, break the recursion when the current list contains characters up to the last character of the string. No return as we
just need to add the current list to the final result. Else we find all the substring starting from the current index that is a 
palidrome and call the method recursively on the next index. After the recursive call, we need to take one step back and remove the 
last palindromic substring we found to allow the pick up of other options. 


Time Complexity: O(n * 2 ^ n)
