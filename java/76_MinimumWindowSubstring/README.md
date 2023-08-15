## Method 1: Two Pointers 同向双指针

We keep an array of size 128 to count the number of appearance for characters (character can be uppercase or lowercase so has to be size 128). Iterate through string t and count number of appearance of each characters as positive numbers. Then in string, we decrement the number of appearance so that characters never appear in t will never get a positive count, and characters that appear in both t and s will get a smaller number than the previous positive count (as it becomes 0, we know we've satisfied the occurrence of the character in string s). Keep incrementing the right pointer until all the characters in string t has also appeared in string s, then start to slide the left pointer until the condition no longer satisfies.

Time Complexity: O(t + s * t)

## Method 2: Optimized

The only difference with method 1 is that instead of checking if all the characters in string t has appeared in string s, we use a count variable to maintain the state of validity.

Time Complexity: O(t + s)
