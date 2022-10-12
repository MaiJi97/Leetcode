## Method 1: Inner class + Sorting

This question asks for subsequence instead of subarray, so we can sort the array to get the largest k elements. However, we need to return the elements in the form of an array, with the order of elements being same as the original array. So we can create an inner class that store not only value of the element but also the index of the element. After we generate the array of Pairs (the new data structure), we can sort the array first by value (to get the largest k elements) and then by index (to display in order of the original array).

Time Complexity: O(nlogn)
