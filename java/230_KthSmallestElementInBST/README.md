## Method 1: DFS / Inorder traverse through recursion

Use a helper function to traverse and store the elements in order in an array list / priority queue. The extra parameter contains information about the current state (the nodes we have already visited) and we are calling the method recursively on its left child and right child in order. Since this is a BST that is sorted so we are visiting and storing its elements in ascending order, we can get the value directly by using get(k-1) method.

Note that we can also get rid of the extra method which takes in the result list as a parameter, but instead make it a global 
variable within the main method.

Time Complexity: O(n)

## Method 2: DFS / Inorder traverse through stack (non-recursion)

This is also utilizing DFS to traverse inorder the elements in the BST. But instead of using recursion, we use a stack to push and pop elements on to / out of the stack inorder, and count until we reach the kth element.

Time Complexity: O(n)

