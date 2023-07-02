## Method 1: Prefix Sum + HashMap

Similar as problem 560, but in 560 we are looking for two prefix sums whose difference is equal to k, while in this problem we are looking for teo prefix sums whose difference is divisible by k -> the remainder of the two prefix sums divided by k is equal. Therefore, instead of storing each prefix sum into the hashmap, we store the remainder after prefix sum divided by k into the hashmap and look for a same remainder in the hashmap. Note that if the remainder is a negative value, we need to first convert it to a positive value.

Time Complexity: O(n)
