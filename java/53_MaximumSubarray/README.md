## Method 1: Prefix Sum + Two Pointers 同向双指针 - fast & slow

As there are negative elements in the array, we intuitively think of prefix sum approach. Then we can use the two pointers approach on
the prefix sum array to determine the greatest difference between two elements, just like the problem best time to buy and sell a stock.

Time Complexity: O(n)

## Method 2: Greedy / Kadane's Algorithm

The difficult part of this problem is figuring out when a negative number is "worth" keeping in a subarray. For example, if 
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4], we are not going to keep the first three elements. What if 
nums = [-2,1000000000,-3,4,-1,2,1,-5,4]? We need a general way to figure out which part of the array is worth keeping - any subarray 
whose sum is positive is worth keeping. 

Let's start with an empty array, and iterate through the input, adding numbers to our array as we go along. Whenever the sum of the 
array is negative, we know the entire array is not worth keeping, so we'll reset it back to an empty array. However, we don't actually 
need to build the subarray. We can just keep an integer variable currentSubarray and add the values of each element there. When adding a
new element makes it smaller, we reset it to the new element (an empty array). Use another variable to continuously track the max sum.

Time Complexity: O(n)

