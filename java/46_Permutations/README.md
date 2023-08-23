## Method 1: DFS / Backtracking

The biggest difference between permutation and subset is that each permutation must contain all the elements in the nums array. We have a helper method that takes in parameters regarding the current state, including the result list and a current list. In the helper method, break the recursion when the current permutation contains all the elements from the nums array. No return as we just need to add the current completed permutation to the final result. Else we call the method recursively on the next index and add them to the current permutation. After the recursive call, we need to take one step back and remove the last element from the current list to allow the pick up of other options. Also note that we will need to create a new array list when adding a subset to the result, or else we are passing in the address of the current permutation list whose value will be modified later.

Note that we can contains() can take O(n), but we can use a hash set to improve the method.

Time Complexity: O(n!)
