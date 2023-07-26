## Method 1: Bucket Sort

We use a hashmap to store each number and its frequency and then start to pick the number whose frequency is the largest. We can use 
bucket sort for this which provides a mapping between numbers and their frequencies. Start pick element from the end of the bucket sort 
array, which includes numbers with most frequency.

Time Complexity: O(n)
