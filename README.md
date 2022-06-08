# Java Solutions to Leetcode 

| #        |  Title                                                                                        |  Category          | Solution          |
|----------|-----------------------------------------------------------------------------------------------|--------------------|-------------------|
| 1        |  [Two Sum](https://leetcode.com/problems/two)                                                 | Hash               | [solution](java/1_TwoSum)|
| 167      |  [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)                | Two Pointers / BS  | [solution](java/167_TwoSum)| 
| 15       |  [Three Sum](https://leetcode.com/problems/3sum/)                                             | Two Pointers       | [solution](java/15_ThreeSum)|
| 16       |  [Three Sum Closest](https://leetcode.com/problems/3sum-closest/)                             | Two Pointers       | [solution](java/16_ThreeSumClosest)|
| 125      |  [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)                          | Two Pointers       | [solution](java/125_ValidPalindrome)|
| 680      |  [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)                    | Two Pointers       | [solution](java/680_ValidPalindrome)|
| 611      |  [Valid Triangle Number](https://leetcode.com/problems/valid-triangle-number/)                | Two Pointers       | [solution](java/611_ValidTriangleNumber)|
| 704      |  [Binary Search](https://leetcode.com/problems/binary-search/)                                | BS                 | [solution](java/704_BinarySearch)|
| 5        |  [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)| DP                 | [solution](java/5_LongestPalindromeSubstring)| 
| 516      |  [Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)| DP             | [solution](java/516_LongestPalindromeSubsequence)| 
| 206      |  [Reverse Linkedlist](https://leetcode.com/problems/reverse-linked-list/)                     | Linkedlist         | [solution](java/206_ReverseLinkedlist)|
| 141      |  [Linkedlist Cycle](https://leetcode.com/problems/linked-list-cycle/)                         | Linkedlist         | [solution](java/141_LinkedlistCycle)|  
| 234      |  [Palindrome Linkedlist](https://leetcode.com/problems/palindrome-linked-list/)               | Linkedlist         | [solution](java/234_PalindromeLinkedlist)| 
| 230      |  [Kth Smallest Element in BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)  | BST                | [solution](java/230_KthSmallestElementInBST)               | 
| 207      |  [Course Schedule](https://leetcode.com/problems/course-schedule/)                            | Graph              | [solution](java/207_CourseSchedule)| 


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
2) 高级写法,当在数组中搜索一个元素时需要访问当前索引元素及其右邻居索引的元素 </br>
while (left < right) -> left = mid + 1, right = mid; </br>
Eg: 33

