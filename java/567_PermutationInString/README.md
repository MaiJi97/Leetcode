## Method 1: Sorting

Since the problem asks for any permutaiton, order is not important. Therefore, we can take any substring from s2 that is of same length 
as s1, sort the strings and compare.

Time Complexity: O(l1logl1 + (l2 - l1)l1logl1)

## Method 2: Two Pointers - sliding window (fixed size)

Another approach is to use sliding window. We can either create hashmaps, or arrays like what we did here, to track the frequencies of 
each characters in both strings (both for s1 at the beginning) and compare if the two arrays are equal. If not, slide the left & right 
pointers of the array for s2 one step at a time until the two arrays become equal.

Time Complexity: O(l1 + 26 * (l2 - l1))
