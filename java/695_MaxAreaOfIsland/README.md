## Method 1: DFS / Traverse through recursion

We iterate through each block in the matrix and for each block we call the DFS method to recursively explore the adjacent blocks and find the area of the island containing this block. The break condition of the recursion is the block is 0 / the block is visited / we reach the border of the matrix.

Time Complexity: O(M * N)

## Method 2: BFS / Traverse through Queue

Similar as DFS, but instead of recursion we use a queue to traverse and compute the area that each block is connected to. Note that when we explore the adjacent block, there are several ways to get the index: 1) Create a deltaX and a deltaY, and then loop through the two arrays and use a two element array, first element being the change in X and second element being the change in Y comparing to the current index. 2) Create a inner class containing the two changes as attribute. 3) loop through int[] direction = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};

<img width="338" alt="Screen Shot 2022-10-19 at 11 06 29 PM" src="https://user-images.githubusercontent.com/106039830/196988040-5a0be2b8-0314-4069-92eb-57219c6814ee.png">


Time Complexity: O(M * N)
