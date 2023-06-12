## Method 1: Stack

Compare with Problem 20 Valid Parentheses which only needs to return true(valid) or false(invalid), this problem additionally requires 
us to fix the string, by modifying minimum number of characters. There are two cases for which we need to modify remove the characters,
which is also the two cases that the parentheses are invalid:
1) when there is ) but there is no ( on the stack
2) when there are elements left on the stack in the end

We do not need to worry about whether the number of parentheses we fix satisfies minimum, since the result is always the same.

Time Complexity: O(n)
