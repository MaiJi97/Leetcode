## Method 1 & 2: Two Pointers 同向双指针 - fast & slow

Similar to problem 26, but will need to use a counter to count number of times a number repeat and add some additional checks. 

Two methods are similar - one uses for loop while the other uses while loop.

For loop - One pointer to iterate through the array, the other pointer to keep track of the previous different character. As the element pointed by i is different from the element pointed by j, we increment j to assign the current character pointed by i and update count. Else, we add an additional check to see if the count is less than 2 and do the same assignment as former case if it is less than 2. Else again, just increment count. 

While loop - One pointer to iterate through the array, the other pointer to keep track of the current different character. So while the element pointed by i is the same as the element pointed by j, add an additional check to see if the count is less than 2 and assign the element at i to position at j if it is less than 2. Then, increment count. 

Time Complexity: O(n)
