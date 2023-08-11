## Method 1: Brute Force

Intuitively, use a copy of the original matrix and modify the original one as we go.

Time Complexity: O(m * n) but space complexity is O(m * n)

## Method 2: Space Efficient Solution

The reason that we cannot iterate and modify the same original matrix as we go but instead need to use a copy for iteration is that 
direct modification will affect what we modify later on (for example, a cell is 0 but changed to 1, then as later we count on it we 
used 1 instead of its original value 0 which is not correct). Keeping this in mind we can use hold on changing the value. Use -1 to
indicate that the value is changed from 1 to 0, and similarly us 2 to indicate that the value is changed from 0 to 1. Later we can 
iterate through the matrix again and change the values to their final version.

总结来说就是，brute force使用单独的数据结构来储存信息，space efficient使用已有的数据结构的一部分储存信息，根据信息改变完其他的部分再回来改变储存信息的部分。

Time Complexity: O(m * n) and space complexity is O(1)
