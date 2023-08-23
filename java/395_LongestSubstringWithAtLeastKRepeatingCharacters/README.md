## Method 1: Two Pointers 同向双指针 - sliding window 

This problem asks for at least K repeating occurrences for each character. Continuing sliding the right pointer won't work - what if k = 3 but the first character only appears once? Then we will never have the chance to slide the left pointer. 

To solve this problem, we can convert it to the longest substring of at most k distinct characters problem. There are only 26 characters so we can use a loop to iterate through the 26 characters and for each character i: look for substring that contains at most i distinct characters (as in the traditiional sliding window problems), and each character appears at least k times. Keep updating the length of the longest substring that satisfies such requirement.

Time Complexity: O(n)
