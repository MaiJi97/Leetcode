## Method 1: Brute Force

Use a nested for loop to look for the two numbers whose sum is the target value. 

Time Complexity: O(n^2)

## Method 2: Hash Map

Store <element, index> as a key value pair. Iterate through the element and look for the other element that sum up to the target with the current element.

Need to clarify: is it sorted? is there duplicate? what to return if no solution? 

Time Complexity: O(n)

## Method 3: Sort and Find

Sorting an array takes O(nlogn) 
Then we can use two pointers or binary search to find the two numbers whose sum is the target value, which takes O(n) or O(nlogn).

Time Complexity: O(nlogn)
