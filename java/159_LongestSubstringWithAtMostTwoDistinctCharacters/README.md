## Method 1: Two Pointers 同向双指针 - sliding window

本题是最多两种character，第三题是不能有两个重复的character。</br>
Slide one pointer i until there are more than two characters in the hashmap, then slide pointer j, decrement the occurrence of the character and remove it from the hashmap as it turns to zero until there are no more than two characters in 
the hashmap. This problem is similar to problem 3, but in problem 3 we know there is no repeating character in any potential
satisfying substring so as we slide pointer j, we only need to slide until we get rid of one and the only one character that is the same
as at pointer i. However, in this problem, any potential satisfying substring can have repeating characters, so we have to slide pointer j until we get rid of all the characters that occur at pointer j. This is why we need hash map to keep track of the number of 
occurrence of each character.

Time Complexity: O(n)
