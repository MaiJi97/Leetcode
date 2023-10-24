## Method 1: Memoization Search (DFS/recursion + Memoization)

Similar to problem 95, but since here it is binary tree instead of binary search tree, we do not need to take in additional parameters like start / end (also memo can be a global variable instead of taken as a parameter) and everything can be written inside the main method. Also to ensure left and right subtrees are full tree, i is incremented by 2 each time.

Time Complexity: 

<img width="446" alt="Screen Shot 2023-10-24 at 12 46 16 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/86a52979-4e27-4ccf-825f-c880a7398491.png">
