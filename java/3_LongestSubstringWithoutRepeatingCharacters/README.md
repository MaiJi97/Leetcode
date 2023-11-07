## Method 1: Two Pointers 同向双指针 - sliding window

Slide one pointer i until we can no longer add character to the hashset (means there is repeating character), then start to slide pointer j and remove the character from the hashset until we again can add character at pointer i to the hashset.

What if the question asks for longest substring with at most k (instead of at most 1) repeating characters?
We need a way to check if substring within current window satisfy that each character has frequency less or equal to k => Use a hash map to count frequency of each character? But still need to iterate through the map each time to check if any frequency exceeds k => We can use a bucket sort.

Time Complexity: O(n)
