## Method 1: DFS / Traverse through recursion

<img width="389" alt="Screen Shot 2023-01-13 at 11 21 16 PM" src="https://user-images.githubusercontent.com/106039830/212457393-e4815666-bd5a-4913-b01a-99d76b46750f.png">

We have a helper method that takes in additional parameters including the result list, a current list and a start index, and then increasingly picks up elements after the start index into the current subset. That is, iterate through the index after the start index and add any possible current subset to the result. After the recursive call, we need to take one step back and remove the last element in the current subset to allow the pick of other elements. Also note that we will need to create a new array list when adding a subset to the result, or else we are passing in the address of the current subset whose value will be modified later. 

Time Complexity: O(n * 2^n)
