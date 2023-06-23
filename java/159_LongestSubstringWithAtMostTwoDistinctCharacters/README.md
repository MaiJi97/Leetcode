## Method 1: Two Pointers 同向双指针

Sliding window - one pointer i to loop through the array, and the other pointer j to track the start index of the subarray with at most 
two distinct characters. This problem is similar to problem 3, but in problem 3 we know there is no repeating character in any potential
satisfying substring so as we slide pointer j, we only need to slide until we get rid of one and the only one character that is the same
as at pointer i. However, in this problem, any potential satisfying substring can have repeating characters, so we have to slide pointer j
until we get rid of all the characters that is the same as at pointer i. This is why we need hash map to keep track of the number of 
occurrences of each character.

Time Complexity: O(n)
