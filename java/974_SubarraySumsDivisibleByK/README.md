## Method 1: Prefix Sum + HashMap

Similar as problem 560, but in 560 we store each prefix sum into the hashmap but here we store the remainder after prefix sum divided by k into the hashmap.
If the remainder is a negative value, we would want to convert it into a positive value.
Time Complexity: O(n)
