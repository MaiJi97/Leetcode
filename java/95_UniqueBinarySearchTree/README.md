## Method 1: Memoization Search (DFS/recursion + Memoization)

To find all the possible permutations of BSTs with n nodes, we can lock one node as the root node and split n - 1 nodes between the 
left and right subtrees in all the possible ways. Let's say we place a node with value i as the root node and place i - 1 nodes having
values from 1 to i - 1 in the left subtree. (If i == 1, the left child is null). Similarly, we place the remaining n - i nodes having 
values from i + 1 to n in the right subtree. (If i == n, the right child is null).

To further improve the solution, we use a hash map memo as cache to store the case we've already computed.

Time Complexity: 

<img width="453" alt="Screen Shot 2023-10-24 at 12 14 02 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/3307face-7a16-480d-947f-2add4a972e2d.png">
