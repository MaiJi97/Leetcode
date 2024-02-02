## Method 1: DFS / Matrix Traverse through recursion - backtracking

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, 
ie: the x and y axis of the current block, and up to which point we've matched characters of the word string. In the main method we 
iterate through each block of the matrix and call the helper method to find if there is a solution starting with the block. In the 
helper method, break the recursion when we complete matching all the characters of the word string and return true, or when we reach the border of the matrix / the block has already been visited / current character does not match. Else we call the method recursively on its neighbors to keep finding elements in the same island. What are the neighbors? They are the four adjacent blocks. Note we need to use the boolean matrix to keep track of which block has been visited because a block cannot be used twice to match the word.

Time Complexity: O(m * n * 3 ^ k) where k is the length of the word


## Method 2: What if we also want to print the path?
