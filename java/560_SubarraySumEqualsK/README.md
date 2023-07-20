## Method 1: Prefix Sum + HashMap

Since there might be negative numbers in the input array, we cannot use two pointers approach, why?

If there are only positive numbers, we slide the right pointer until it exceed certain boundary / the sum is too big, and then start sliding the left pointer / making the sum smaller until it goes under the boundary. However, if there are negative number, it is possible to obtain a larger number by continuing sliding the left pointer. Therefore, the two pointer approach won't work and we should apply the prefix sum approach instead here:

<img width="609" alt="Screen Shot 2022-07-23 at 11 42 16 PM" src="https://user-images.githubusercontent.com/106039830/180658103-6d15c331-1e60-45f4-8c76-a5c864f4b4d9.png">

We store each possible prefix sum and its number of occurrences in a hash map.

Time Complexity: O(n)
