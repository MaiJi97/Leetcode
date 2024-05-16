## Method 1: DFS / Divide and Conquer

There are four possibilities:

<img width="632" alt="Screen Shot 2023-07-31 at 3 33 20 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/59bf56cc-e390-40be-b956-c6a208aad8ad.png">

Note that a node can have negative or positive values, so a path sum contributed by a subtree could also be negative or positive. It would make sense to consider a path sum contributed by a subtree only if it is positive. In other words, the path goes down the left or the right subtree only if we see a gain in the path sum. If not, we can safely ignore it.

This helper method takes the root of the subtree as the input. The function returns the path sum gain contributed by the subtree. We can understand it as the maximum sum of the path (either from left subtree or right subtree) that ends at the current subtree node. To calculate the path sum gain, the function calls itself recursively on the subtree's left and right child. 

We have considered the scenario where the maximum sum path passes through the root. But what if it doesn't?

<img width="588" alt="Screen Shot 2023-07-31 at 4 44 29 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/4c9427bf-1bf0-4aea-95de-1fa9505f1a26.png">

We slightly tweak our algorithm to include the case when the path sum doesn't pass through the root. Now, in addition to returning the 
path sum gain contributed by the subtree, the recursive function also keeps track of the maximum path sum. We update the maximum path 
sum whenever we find a new maximum.

Time Complexity: O(n)
