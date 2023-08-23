## Method 1: DFS / Traverse through recursion - backtracking

<img width="389" alt="Screen Shot 2023-01-13 at 11 21 16 PM" src="https://user-images.githubusercontent.com/106039830/212457393-e4815666-bd5a-4913-b01a-99d76b46750f.png">

We have a helper method that takes in additional parameters including the result list, a current list and a start index. In the helper method, break the recursion when we complete traversing a subset (any current group of elements can be a subset). No return as we just need to add whatever we have so far to the final result as a valid subset. Then we call the method recursively on the next index to picks up elements after the start index into the current subset. That is, iterate through the elements after the start index and continue to add any possible current subset directly to the result. After the recursive call, we need to take one step back and remove the last element in the current subset to allow the pick of other elements. Also note that we will need to create a new array list when adding a subset to the result, or else we are passing in the address of the current subset whose value will be modified later. 

Time Complexity: O(n * 2^n)
