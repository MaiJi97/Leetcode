## Method 1: Two Pointers
Since the array is sorted, we can set two pointers, one from the start of the array, the other from the end of the array. By comparing the sum of the numbers at the current two indices with the target value, we know which way we will need to shift the two pointers. <br />

Time Complexity: O(n)


## Method 2: Binary Search
We can use a loop to go through each element in the array, and look for the (target - num) value. Instead of using a hashmap or a hashset, we can use a binary search to do that which has a time complexity of O(logn) <br />

Overall complexity will be O(nlogn)



