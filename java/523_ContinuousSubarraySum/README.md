## Method 1: Prefix Sum + Hashmap

Similar as problem 974, but in 974 we care about total number of such subarrays we can obtain so in the hashmap we store the remainder 
of prefix sum divided by k and number of times it occurs. But in this problem we only care about if or not we have such a subarray
(true or false) while at the same time we need the length of the subarray to be at least 2. So in the hashmap we store the remainder 
of prefix sum divided by k and the index it corresponds to in order to compute the length instead of number of occurrenceof the remainder. If there is the same remainder in the hashmap and the length is at least k, then return true; else if the remainder is not in the hashmap, we put it in the hashmap (we only need to put each remainder once which is the smallest index at which it appears in the array).

Time Complexity: O(n)
