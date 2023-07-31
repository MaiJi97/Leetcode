## Method 1: DFS / Divide and Conquer

This is a combination of problem 144 (preorder traversal) and problem 1008 (build BST). For traversal, we create dfs as a separate method, but we do not need to return anything as we take in the output string builder as an additional input into the dfs method and add nodes to it as we traverse. For tree ocnstruction, apply the divide and conquer approach. We also create a separate method, but will need to return the resulting tree.

<img width="634" alt="Screen Shot 2023-07-31 at 8 18 13 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/58db2cf4-5e24-45d6-bc55-e7a8142ed96d.png">


Time Complexity: (n)
