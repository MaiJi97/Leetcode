## Method 1: DFS / Traverse through recursion - backtracking

This problem can be solved through a normal DFS approach. Think about when to add '(' to the current string and when to add ')' => '(' can 
be added any time, while ')' can only be added when its previous occurrence is fewer than that of '('.

<img width="610" alt="Screen Shot 2023-07-19 at 3 50 38 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/a54bd814-3fda-4129-9a6f-366cb54adb97.png">

Time Complexity:

<img width="75" alt="Screen Shot 2023-07-19 at 6 04 00 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/997e45dc-5cdf-4718-9cfa-4d27bb0eae72.png">
