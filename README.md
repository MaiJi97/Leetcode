# Java Solutions to Leetcode 

| #        |  Title                                                                                        |  Category                    | Solution          |
|----------|-----------------------------------------------------------------------------------------------|------------------------------|---------------|
| 1        |  [Two Sum](https://leetcode.com/problems/two)                                                 | Hash                         | [solution](java/1_TwoSum)|
| 167      |  [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)                | Two Pointers / Binary Search | [solution](java/167_TwoSum)| 
| 15       |  [Three Sum](https://leetcode.com/problems/3sum/)                                             | Two Pointers                 | [solution](java/15_ThreeSum)|
| 16       |  [Three Sum Closest](https://leetcode.com/problems/3sum-closest/)                             | Two Pointers                 | [solution](java/16_ThreeSumClosest)|
| 125      |  [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                          | Two Pointers                 | [solution](java/125_ValidPalindrome)|
| 680      |  [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)                    | Two Pointers                 | [solution](java/680_ValidPalindrome)|
| 611      |  [Valid Triangle Number](https://leetcode.com/problems/valid-triangle-number/)                | Two Pointers                 | [solution](java/611_ValidTriangleNumber)|
| 704      |  [Binary Search](https://leetcode.com/problems/binary-search/)                                | Binary Search                | [solution](java/704_BinarySearch)|
| 852      |  [Peak Index in Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/)| Binary Search                | [solution](java/852_PeakIndexInMountainArray)|
| 33       |  [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)| Binary Search              | [solution](java/33_SearchInRotatedSortedArray)|
| 658      |  [FindKClosestElement](https://leetcode.com/problems/find-k-closest-elements/)                | Binary Search                | [solution](java/658_FindKClosestElement)|
| 206      |  [Reverse Linkedlist](https://leetcode.com/problems/reverse-linked-list/)                     | Linked List                  | [solution](java/206_ReverseLinkedlist)|
| 141      |  [Linkedlist Cycle](https://leetcode.com/problems/linked-list-cycle/)                         | Linked List                  | [solution](java/141_LinkedlistCycle)|  
| 234      |  [Palindrome Linkedlist](https://leetcode.com/problems/palindrome-linked-list/)               | Linked List                  | [solution](java/234_PalindromeLinkedlist)| 
| 230      |  [Kth Smallest Element in BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)  | Tree / DFS                   | [solution](java/230_KthSmallestElementInBST)| 
| 104      |  [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)  | Tree / DFS                   | [solution](java/104_MaximumDepthOfBinaryTree)| 
| 110      |  [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)                  | Tree / DFS                   | [solution](java/110_BalancedBinaryTree)| 
| 257      |  [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)                        | Tree / DFS                   | [solution](java/257_BinaryTreePaths)| 
| 114      |  [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)| Tree / DFS         | [solution](java/114_FlattenBinaryTreeToLinkedList)| 
| 236      |  [Lowest Common Ancester of Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)| Tree / DFS | [solution](java/236_LowestCommonAncestorOfBinaryTree)| 
| 102      |  [BinaryTreeLevelOrderTraversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)| Tree / BFS               | [solution](java/102_BinaryTreeLevelOrderTraversal)| 
| 107      |  [BinaryTreeLevelOrderTraversal](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/)| Tree / BFS            | [solution](java/107_BinaryTreeLevelOrderTraversal)| 
| 133      |  [Clone Graph](https://leetcode.com/problems/clone-graph/)                                    | Graph / BFS                  | [solution](java/133_CloneGraph)|
| 207      |  [Course Schedule](https://leetcode.com/problems/course-schedule/)                            | Graph / BFS                  | [solution](java/207_CourseSchedule)| 
| 5        |  [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)| DP                           | [solution](java/5_LongestPalindromeSubstring)| 
| 516      |  [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)| DP                       | [solution](java/516_LongestPalindromeSubsequence)| 


# Notes in Essential Categories

## Two Pointers
### 1) 相向
One pointer starting from the beginning of the array, the other pointer starting from the end of the array, and shift towards each other. Incrementing or decrementing the left or right pointers in order to reach a target value. We usually use a while loop with condition left < right, and the array is usually in some sort of order.

## Binary Search
In a sorted array with boundaries, want to look for a target value or index. </br>

两种写法：</br>
1) 基础写法，用于搜索一个可以通过访问单个索引来确定的元素，无需后续处理直接返回 </br>
while (left <= right) -> left = mid + 1, right = mid - 1; </br>
Eg: 704 </br>
2) 高级写法，用于搜索一个元素时需要访问当前索引元素及其右邻居索引的元素 </br>
while (left < right) -> left = mid + 1, right = mid; </br>
Eg: 33

## Divide and Conquer 
通常应用于二叉树和数组

## Binary Tree / Binary Search Tree / Graph
常见方法：
1) DFS through Recursion </br>
   Can also use a non recursion / iterative approach through Stack </br>
   
   a. Preorder / Inorder / Postorder traverse 遍历法</br>
   Eg: #230
   
   b. Divide and Conquer 分治法</br>
   需思考整棵树在问题上的结果和根+左子树+右子树的结果的关系：
   左子树返回结果 = DivideAndConquer(root.left) </br>
   右子树返回结果 = DivideAndConquer(root.right) </br>
   整棵树的结果 = 按一定方法合并左右子树结果 </br>
   
2) BFS through Queue </br>
   Queue的实现：Linked List / ArrayDeque (preferred because it is faster) </br>
   
   a. Level Order Traverse through Queue </br>
   
      分层 or 不分层？
   
      - BFS in Tree: </br>
        Eg: #102 </br>
   
      - BFS in Graph: </br>
        Need to use a hashset to determine if the node has already been visited. </br>
        Eg: #133, #127 (shortest path in simple graph)
   
   b. BFS in Matrix（连通块）: </br>
      Eg: #200
   
   c. Topological Sorting（拓扑排序）: </br>
      - 求任意一个拓扑排序 Eg: #207
      - 问是否有拓扑排序
      - 求是否存在且仅存在一个拓扑排序
      - 求字典序最小的拓扑排序
   
Binary Tree 常见题型：
- 二叉树上求值 (Max,Min,Sum,Average,Paths)
- 二叉树结构变化 (Flatten to Linked List)
- BST

## DFS
Tree, Graph </br>
Combination and Permutation problems </br>
Matrix, etc

## Dynamic Programming

a. 记忆化搜索 Memoization Search through Recursion, 递归方式 </br>
DFS + 记忆 </br>
缺点：不适合O(n)的DP问题，会造成stack overflow

b. 迭代方式 / 多重循环

什么场景可以用DP？
1) 最优值
2) 可行性
3) 方案数

<img width="798" alt="Screen Shot 2022-06-25 at 9 48 39 PM" src="https://user-images.githubusercontent.com/106039830/175795975-1b332dc0-91ee-47f5-a7f7-ff86e05c4d2e.png">

DP的常见题型：
1) 坐标型 (一维坐标，二维坐标) </br>
dp[i]代表从起点走到坐标i的最优值/可行性/方案数 </br>
dp[i][j]代表从起点走到坐标i，j的最优值/可行性/方案数 </br>
Eg: #120, #62 </br>

2) 前缀型

- 划分型 </br>
dp[i]代表前i个字符的最优值/可行性/方案数 </br>
dp[i][j]代表前i个字符划分为j个部分的最优值/可行性/方案数 </br>
Eg: #139 </br>

- 匹配型 </br>
dp[i][j]代表第一个字符串的前i个字符匹配上第二个字符串的前j个字符的最优值/可行性/方案数 </br>
Eg: #1143, #44 </br>

3) 背包型 * </br>
dp[i][j]代表前i个物品里选出一些物品组成和为j大小的最优值/可行性/方案数 </br>

DP的四要素: 
1) 状态State: 递归的定义 </br>
dp[i][j]定义某个规模更小的问题的答案

2) 方程Function: 递归的拆解
大问题如何拆解为小问题 </br>
dp[i][j]通过规模更小的一些状态求max/min/sum/or来进行推导

3) 初始化Initialize: 递归的出口 </br>
无法再拆解的极限小的状态下的值 </br>
dp[0][0] or dp[i][0] or dp[0][i]

4) 答案Answer: 递归的调用 </br>
最后的return，如dp[m][n]

