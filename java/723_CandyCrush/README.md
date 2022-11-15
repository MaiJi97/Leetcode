## Method 1: Recursion

There are two steps we need to take in this question: 1) loop through each row and each column of the board, and mark it if it need to be crushed. 2) Crush
the candies and update the board. </br>

As we loop through the rows and column, we check if the current cell and its next two cells are equal in order to determine if we will 
mark the current cell as to be crushed. If we find them equal, then we will mark all the three cells as to be crushed. </br>

We might consider to mark a cell with a negative number like -1 to indicate it needs to be crushed. However, in some cases like below, after we loop through
all the rows and mark the cells to be -1, it may destroy a vertical connection so some cells cannot be marked as to be crushed when we loop through the 
columns: </br>

2 3 4 5 5 4 5 6 7 </br>
2 3 4 5 4 4 4 4 4 </br>
2 3 3 4 3 4 3 6 4 </br>
becomes: </br>
2 3 4 5 5 4 5 6 7 </br>
2 3 4 5 -1-1-1-1-1 </br>
2 3 3 4 3 4 3 6 4 </br>

A smart way to deal with this is to use absolute value instead. So as we loop through a cell, we take the absolute value of it, and compare with the 
absolute value of its next two cells. If it needs to be crushed then we update its value to be the negative number of its value (4 -> -4).

Time Complexity: O(n^2)
