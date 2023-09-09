## Method 1: Two Stacks

The hard part of the problem is that after removing a set of adjacent duplicates, characters to the left and characters to the right may form another set of adjacent duplicates, which is why we need to use stack to track it. Also the problem requires that the number of adjacent duplicates to be removed must be k, which is why we need two stacks. One stack has all the characters we want to be present in the string, the other stack has the count for each adjacent character substring so we can track how many adjacent duplciates we have so far. For example, we have 'baaaaabbbbccccccccccbbbbb' and k = 10.

To begin with, a 'b' is pushed to the first stack, and 1 is pushed to the second stack. Then, 5 consecutive 'a's are pushed to the first stack and 5 is pushed to the second stack. Following that, 4 consecutive 'b's are pushed to the first stack and 4 is pushed to the second stack, etc. That is, each element in the second stack corresponds to an adjacent character substring in the first stack.
We have to use a stack instead of a hashmap because to keep the correspondence between the adjacent character substring and number of adjacent character. If we use hashmap, the above case won't be solved correctly because the first 'b' can also be counted toward the adjacent 4 'b's.

Time Complexity: O(n)
