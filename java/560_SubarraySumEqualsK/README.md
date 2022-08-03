## Method 1: Prefix Sum + HashMap

Since there might be negative numbers in the input array, we cannot use two pointers approach. Instead, we apply the prefix sum approach here:

<img width="609" alt="Screen Shot 2022-07-23 at 11 42 16 PM" src="https://user-images.githubusercontent.com/106039830/180658103-6d15c331-1e60-45f4-8c76-a5c864f4b4d9.png">

We store each possible prefix sum and its number of occurrences in a hash map.
