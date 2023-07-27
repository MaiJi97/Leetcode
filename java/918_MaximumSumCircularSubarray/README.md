## Method 1: Greedy / Kadane's Algorithm

The difference between this problem and the normal maximum subarray is that, this problem also consider the case that the maximum subarray
sum can be splitted into two parts, on both sides of the array. In this case, we can use the Kadane's algorithm to find the minimum
subarray sum and substract it from the total sum of all the elements of the array. 

<img width="514" alt="Screen Shot 2023-07-21 at 6 38 34 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/ea797239-4dea-4c8a-a5af-177973469c6f">

And in the other case where the subarray is a continuous, just apply the Kadane's algorithm to find the maximum subarray sum directly.

Time Complexity: O(n)
