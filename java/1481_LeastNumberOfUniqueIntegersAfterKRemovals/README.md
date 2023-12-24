## Method 1: Bucket Sort

Since we want to keep least number of unique integers and remove most number of integers, we would want to count the frequency of each 
number and then start removing from those with least frequency -> we can use bucket sort for this which provides a mapping between numbers
and their frequencies. Start removing from the start of the bucket sort array which includes numbers with least frequency.

Time Complexity: O(n)

## Method 2: Bucket Sort Improved

Same as method 1, but in the bucket sort, instead of storing a list of actual elements for each frequency, we only need to count how many elements there are have this frequency and proceed with removing the frequency as k is still greater than 0.

Time Complexity: O(n)

