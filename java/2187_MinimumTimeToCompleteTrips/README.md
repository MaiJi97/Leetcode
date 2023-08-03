## Method 1: Binary Search

Similar with Problem 410. Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like this 
through guessing the answer by calculation through mid value. Here we aim to pick a time period T, such that the n trips could be 
distributed to all the buses and buses are continuously working on the task within the time period if possible. Note for the time period 
T, the smallest possible value is 1, and the largest possible value is the maximum value in time array times number of trips. Therefore,
we can get a mid value first, and then use this mid value to compute total number of trips we can complete within this time period. If 
the total number of trips is fewer than required, we know that T has to be greater and we only need to consider the second half; if the
total number of trips is greater than required, we know that T could be smaller and we only need to consider the first half.

<img width="608" alt="Screen Shot 2023-08-03 at 11 13 08 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/5a71ba75-aae8-4f2d-80de-ad5dd21626cb.png">


Time Complexity: O(nlogn)
