## Method 1: DFS / Matrix Traverse through recursion - backtracking

DFS matrix traverse through recursion. We have a helper method that takes in additional information regarding the current state, ie: the x and y axis of the current 
cell, and a visited 2-D array to keep track of the cells we have visited. In the main method we iterate through each cell of the matrix and call the helper method to 
find the maximum gold we can obtain starting from the current cell. In the helper method, break the recursion when we reach the border / when the current cell contain
0 gold / the cell has already been visited. Else we call the method recursively on its neighbors to collect gold along the paths. What are the neighbors? They are the
four adjacent cells. Note we need to use the boolean 2D array to keep track of which cell has been visited because a cell should not be visited twice.

Time Complexity: O(m * n * 4 ^ g) where g is the number of the golds

