## Method 1: Brute Force

Use nested for loops. For each element in nums1 array, iterate through each element in nums2 array and locate the nums1 element first, and then continue to iterate until the end of nums2 array and check for the next greater element.

Time Complexity: O(n^2)

## Method 2: Brute Force Improved

Improved by using a hash map. For each element in nums1 array, we will only look for next greater element from the index of the element
in nums2 array. So we can store the index of each element in nums2 and look for result from the index.

Time Complexity: O(n^2)

## Method 3: Monotonic Stack

Use monotonic stack for problems like next greater element, next smaller element, previous greater element and previous smaller element, etc (当we care about每个element与前后的element形成的大小关系）:

递增栈: for each element in the array, we are looking for an element AFTER it that is greater than it. Keep executing the while loop as: the stack is not empty, and the peek element is smaller than the current element.

<img width="796" alt="Screen Shot 2023-06-12 at 5 18 48 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/1c6c250b-01d6-4ed4-8991-ddd17b3acc11.png">

Time Complexity: O(n)
