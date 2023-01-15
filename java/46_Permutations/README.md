## Method 1: DFS / Traverse through recursion

The biggest difference between permutation and subset is that each permutation must contain all the elements in the nums array. We have a helper method that takes in a parameter of the result list and a current list, and iterates through each element in the nums array to see if it is already in the current
list. If not add it to the current list, recursively call the method on the rest of the element. After the recursive call, we need to take one step back and remove the last element in the current list to allow the pick up of other options. Also note that we will need to create a new array list when adding a subset to the result, or else we are passing in the address of the current permutation list whose value will be modified later.

Note that we can contains() can take O(n), but we can use a hash set to improve the method.

Time Complexity: O(n!)
