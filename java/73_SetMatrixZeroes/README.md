## Method 1: Brute Force

Intuitively, we can use two hashsets to store row and column number of zero cell in the original matrix. Then, loop through the matrix
and for any cell that has the same row or column, set it to zero. 

Time Complexity: O(m * n) but space complexity is O(m + n)

## Method 2: Space Efficient Solution

The reason that we cannot iterate and modify the same original matrix as we go but instead need to store the information of zero cell somewhere else is that direct modification will affect what we modify later on (and in the end all the blocks may potentially become zero). Keeping this in mind we can use the first row and column as a flag / indicator for if or not a row or column should all be set to zero. That is, if a cell
(i, j) is zero, we set matrix[i][0] and matrix[0][j] to zero. Then iterate through rows and columns from index 1 and modify it according to the value at matrix[i][0] and matrix[0][j]. 

Note that we have not yet modified the first row and column. Those cells need to be modified separately depending on if or not there is a zero on the same row or column.

总结来说就是，brute force使用单独的数据结构来储存信息，space efficient使用已有的数据结构的一部分储存信息，根据信息改变完其他的部分再回来改变储存信息的部分。

Time Complexity: O(m * n) and space complexity is O(1)
