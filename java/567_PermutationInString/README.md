## Method 1: Sorting

Since the problem asks for any permutaiton, order is not important. The idea behind this approach is that one string will be a permutation of another string only if both of them contain the same characters the same number of times. Therefore, we can take any substring from s2 that is of same length as s1, sort both strings and compare. 

Note that we can only sort substring, not the whole string at the beginning, as what being asked here is substring, not subsequence.

Time Complexity: O(l1logl1 + (l2 - l1)l1logl1 * 26)

## Method 2: Hash Map

Similar as the sorting approach, but can improve the O(nlogn) time complexity for sorting to O(n), as we compare the characters appear in both strings and the number of times they appear.

Time Complexity: O(l1 + (l2 - l1)l1 * 26)

## Method 3: Hash Map => Array

Similar as the hash map approach, but use arrays of size 26 instead.

Time Complexity: O(l1 + (l2 - l1)l1 * 26)

## Method 4: Two Pointers - sliding window (fixed size) - two arrays

Another approach is to use sliding window, which is optimized from the above approaches. In method 2 and 3, we are doing a lot of repeated work as for each new substring that is only one place shift from the previous substring, we still need to recreate the hashmap / array and recount the frequencies. Instead, we can modify directly on the existing hashmap / array. Shift both left pointer and right pointer together, each for one step at a time. Since the window has a fixed length, we do not need the while loop under the for iteration.

Time Complexity: O(l1 + (l2 - l1) * 26)

## Method 5: Two Pointers - sliding window (fixed size) - single array

Same idea as in method 4, but using one frequencies array.

Time Complexity: O(l1 + (l2 - l1) * 26)
