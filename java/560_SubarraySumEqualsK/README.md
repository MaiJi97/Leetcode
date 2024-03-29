## Method 1: Prefix Sum + Hash Map

Since there might be negative numbers in the input array, we cannot use two pointers approach, why?

If there are only positive numbers, we slide the right pointer until it exceed certain boundary / the sum is too big, and then start sliding the left pointer / making the sum smaller until it goes under the boundary. However, if there are negative number, it is possible to obtain a smaller number by continuing sliding the right pointer, or obtain a larger number by continuing sliding the left pointer. 

We can use a brute force method here, to get all possible subarrays in O(n^2) and compute the sum of each subarray in O(n) which could also be completed together with the previous step. Overall it takes O(n^3) or at least O(n^2), which is not good. Instead, we could apply a prefix sum approach here:

<img width="609" alt="Screen Shot 2022-07-23 at 11 42 16 PM" src="https://user-images.githubusercontent.com/106039830/180658103-6d15c331-1e60-45f4-8c76-a5c864f4b4d9.png">

Time Complexity: O(n)

## Method 2: Prefix Sum + Hash Map Improved

Theoratically we should use an array to compute the prefix sum at each element through one iteration first, and then use the hash map to update the frequency of each prefix sum through another iteration as in method 1. But actually we can skip the array in the first iteration as we only need to compute each possible prefix sum and update its frequency directly in a hash map. By substracting k from it we know the target prefix sum we are looking for. Now we can get the occurrence of the prefix sum and add it to the result.

Time Complexity: O(n)
