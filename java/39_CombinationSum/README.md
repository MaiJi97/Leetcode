## Method 1: DFS / Traverse through recursion

Same template as problem 78 Subsets I. The only difference is that subset does not contain duplicate elements but here we have can use any element for unlimited number of times. We use a helper method that takes in additional parameters regarding the current state. When do we break the recursion? When the current sum is equal to the target sum. Else we add the current index element to the current combination sum and call the method recursively on the current index again to add more elements to the current combination sum. After the recursive call, we need to take one step back and remove the last element from the current combination sum to allow the pick of other options. Also note that we will need to create a new array list when adding a combination sum to the result, or else we are passing in the address of the current combination sum whose value will be modified later.

Time Complexity: 

<img width="666" alt="Screen Shot 2023-01-15 at 4 40 58 PM" src="https://user-images.githubusercontent.com/106039830/212571101-ba06b391-17dc-466b-b954-9a469c6d913b.png">
