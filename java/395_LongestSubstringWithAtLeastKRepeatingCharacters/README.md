## Method 1: Two Pointers 同向双指针 - sliding window 

This problem asks for at least K repeating occurrences for each character. There are only 26 characters so we can use a 
loop to iterate through the 26 characters and for each character i: look for substring that contains at most i distinct characters (as in other traditiional sliding window problems), and each character appears at least K times. Keep updating the length of the longest substring that satisfies such requirement.

Time Complexity: O(n)
