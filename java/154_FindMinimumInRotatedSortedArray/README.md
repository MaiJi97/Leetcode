## Method 1: Binary Search

Similar as Problem 153. The only difference is that there might be duplicates in this problem, so all we need to do is to add an additional case in the binary search that when nums[mid] is equal to nums[right], it is possible the pivot is on the left side or on the right side. We can decrement the upper bound by one to reduce the scope in this case.

<img width="420" alt="Screen Shot 2023-11-27 at 12 16 29 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/776e4495-87d3-495d-8af7-b87c73f2ac2b.png">

Time Complexity: O(logn)

