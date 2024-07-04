## Method 1: Two Pointers 同向双指针 - sliding window

Note that to check the substring does not contain any forbidden words, we need to use a loop to check for all the substrings within the substring, from each index up to the end.

Time Complexity: O(n ^ 2)

## Method 2: Two Pointers 同向双指针 - sliding window - improved

Same as method 2, but for optimization purpose we contain check the substrings within the substring, we only check for those between (len - max length of forbidden word) up to 
the end.

Time Complexity: O(n ^ 2)

## Method 3: Two Pointers 同向双指针 - sliding window - improved again

Note that in method 2, we are doing a lot of repetitive work within the while loop. Instead, we can loop from the end of the string builder, and stop when we reach a subtring 
that the forbidden set contains.

Time Complexity: O(n)
