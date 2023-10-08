## Method 1: BFS / Matrix Traverse through Queue

Similar as problem 200 number of islands. Though in this problem we need to keep track of all the coordinates of 'O' that we traverse, and also if the island reach 
the border, so that we flip the cell if and only if the island containing the cell does not reach the border.

Time Complexity: O(m * n)

## Method 2: BFS / Matrix Traverse through Queue Alternative

Another approach is to start traverse the island of 'O' from the border cells. After we complete traversing all the island of 'O' that reach the border, we know that
a cell in the matrix should be X if it is not visited.

Time Complexity: O(m * n)

## Method 3: DFS / Matrix Traverse through recursion

Similar approach as method 2, but use DFS to traverse the matrix instead.

Time Complexity: O(m * n)
