## Method 1: Memoization Search (DFS/recursion + Memoization)

<img width="515" alt="Screen Shot 2023-06-27 at 2 02 06 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/2b8569ed-9864-47bc-aab1-3e1a1920f0a6.png">

Time Complexity: O(k * n * n)

## Method 2: Memoization Search (DFS/recursion + Memoization) + Binary Search

We can get rid of half of the floors through comparison between checks needed above the current floor and checks needed below the 
current floor.

Time Complexity: O(k * n * logn)
