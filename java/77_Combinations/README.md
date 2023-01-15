## Method 1: DFS / Traverse through recursion

Same template as problem 78 Subsets I. The only difference is that subset can have any number of elements but here we have k elements. We use a helper method that takes in additional parameters regarding the current state. When do we break the recursion? When the current combination has size of k. Else we add the current index element to the current combination and recursively call the method on the next index to add elements to the current combination. After the recursive call, we need to take one step back and remove the last element in the current combination to allow the pick of other elements. Also note that we will need to create a new array list when adding a combination to the result, or else we are passing in the address of the current combination whose value will be modified later.

Time Complexity: 

<img width="229" alt="Screen Shot 2023-01-14 at 11 20 56 PM" src="https://user-images.githubusercontent.com/106039830/212524211-b4d3bc87-689b-43d8-9504-c1c513cb0f63.png">
