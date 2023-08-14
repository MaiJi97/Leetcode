## Method 1: Two Pointers 相向双指针

First, we can sort the array even though the problem specifies "subsequence" because the order of elements in the subsequence does not affect the result. 

<img width="673" alt="Screen Shot 2023-07-18 at 3 38 22 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/b7986233-c4a7-48a1-a3f6-ef2ced6dbe39">

After the array is sorted, we can apply a normal two pointers approach - left pointer at the minimum value and right pointer at the 
maximum value. If their sum exceeds the limit, decrement the right pointer, else compute the total number of subsequences in between
through the power method.

Note that in java, Math.pow() could cause the overflow of long data type, so we need to mod the result by 1000000007.

Time Complexity: O(nlogn)
