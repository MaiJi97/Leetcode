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
| 5        |  [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)| DP                           | [solution](java/5_LongestPalindromeSubstring)| 
| 516      |  [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)| DP                       | [solution](java/516_LongestPalindromeSubsequence)| 
| 206      |  [Reverse Linkedlist](https://leetcode.com/problems/reverse-linked-list/)                     | Linked List                  | [solution](java/206_ReverseLinkedlist)|
| 141      |  [Linkedlist Cycle](https://leetcode.com/problems/linked-list-cycle/)                         | Linked List                  | [solution](java/141_LinkedlistCycle)|  
| 234      |  [Palindrome Linkedlist](https://leetcode.com/problems/palindrome-linked-list/)               | Linked List                  | [solution](java/234_PalindromeLinkedlist)| 
| 230      |  [Kth Smallest Element in BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)  | Tree                         | [solution](java/230_KthSmallestElementInBST)| 
| 104      |  [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)  | Tree                         | [solution](java/104_MaximumDepthOfBinaryTree)| 
| 110      |  [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)                  | Tree                         | [solution](java/110_BalancedBinaryTree)| 
| 257      |  [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)                        | Tree                         | [solution](java/257_BinaryTreePaths)| 
| 114      |  [Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/)| Tree               | [solution](java/114_FlattenBinaryTreeToLinkedList)| 
| 236      |  [Lowest Common Ancester of Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)| Tree       | [solution](java/236_LowestCommonAncestorOfBinaryTree)| 
| 207      |  [Course Schedule](https://leetcode.com/problems/course-schedule/)                            | Graph                        | [solution](java/207_CourseSchedule)| 


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
1) DFS & Traverse through Recursion </br>
   Can also use a non recursion / iterative approach through Stack </br>
   Eg: #230
   
2) Divide and Conquer through Recursion </br>
   需思考整棵树在问题上的结果和根+左子树+右子树的结果的关系：
   左子树返回结果 = DivideAndConquer(root.left) </br>
   右子树返回结果 = DivideAndConquer(root.right) </br>
   整棵树的结果 = 按一定方法合并左右子树结果 </br>
3) BFS & Level Order Traverse through Queue </br>
   Queue的实现：Linked List / ArrayDeque (preferred because it is faster)
   
   BFS of a Tree: </br>
   Eg: #102 </br>
   
   BFS OF a Graph: </br>
   Need to use a hashset to determine if the node has already been visited. </br>
   Eg: #133
   
Binary Tree 常见题型：
- 二叉树上求值 (Max,Min,Sum,Average,Paths)
- 二叉树结构变化 (Flatten to Linked List)
- BST

