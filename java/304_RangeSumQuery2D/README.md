## Method 1: Prefix Sum 

<img width="246" alt="Screen Shot 2023-07-03 at 5 29 56 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/64abae45-2665-4ae8-89ac-c68f69cff73b.png">

We can construct another 2D matrix so that each block stores the sum of all the blocks within the rectangle between the origin and the 
current block. In this way, the sumRegion method can be implemented as the sum of multiple prefix sum blocks.

<img width="428" alt="Screen Shot 2023-07-03 at 7 19 11 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/5a0859a0-76a0-4612-bdfc-34a0df823dff.png">

Note that the prefixSum matrix is one row / column more than the original matrix as it records the first n (which include 0) row / column. 最外围的一圈都为0.

Time Complexity: O(1)
