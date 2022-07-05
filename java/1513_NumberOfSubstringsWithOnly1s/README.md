## Method 1: Two Pointers 同向双指针
One pointer i to loop through the string, the other pointer j to loop through i+1 until the end of the string, and look for consecutive 1s which count substrings towards the result.

Time Complexity:
O(n)
