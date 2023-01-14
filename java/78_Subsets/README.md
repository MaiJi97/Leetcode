## Method 1: DFS / Traverse through recursion

<img width="389" alt="Screen Shot 2023-01-13 at 11 21 16 PM" src="https://user-images.githubusercontent.com/106039830/212457393-e4815666-bd5a-4913-b01a-99d76b46750f.png">

We have a helper method that takes in a parameter start index, and increasingly pick up elements after the start index into the current subset. That is, 
iterate through the index after the start index and add any possible current subset to the result. After the recursive call, we need to take one step back 
and remove the last element in the current subset to allow other options.

Time Complexity: O(n * 2^n)
