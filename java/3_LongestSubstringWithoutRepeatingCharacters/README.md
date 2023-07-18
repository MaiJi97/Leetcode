## Method 1: Two Pointers 同向双指针 - sliding window

Slide one pointer i until we can no longer add character to the hashset (means there is repeating character), then start to slide pointer j and remove the character from the hashset until we again can add character at pointer i to the hashset.

Time Complexity: O(n)
