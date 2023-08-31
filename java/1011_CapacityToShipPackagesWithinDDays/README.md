## Method 1: Binary Search

Similar with Problem 410. Though the given array is not sorted, we sometimes use binary search to deal with a hard problem like 
this through guessing the answer by calculation through mid value. Here we aim to pick the least capacity of the ship such that 
all the packages can be evenly distributed into the ship and can be delivered within k days. Note for the capacity, the smallest 
possible value is the maximum weight in the weights array, and the largest possible value is the sum of all the weights in the 
weights array. Therefore, we can get a mid value first, and then use this mid value to compute the number of days we need to get
all the packages delivered. If the number of days is smaller than m, we know we can continue to decrement the capacity; if the
number of days is greater than k, we know the capacity has to be incremented.

Time Complexity: O(nlogn)
