## Method 1 & 2: Two Pointers 同向双指针 - fast & slow

Two methods are similar - one uses for loop while the other uses while loop. 

For loop - One pointer to iterate through the array, the other pointer to keep track of the previous different character. As the element pointed by i is different from the element pointed by j, we increment j to assign the count of the previous character, update count, and assign the current character pointed by i. Else, just increment count. However, an issue with this aproach is that we will miss the count of the final character so we will need to do it again only for the count of the final character after we break out of the for loop.

While loop - One pointer to iterate through the array, the other pointer to keep track of the current different character. So while the element pointed by i is the same as the element pointed by j, keep incrementing count. After we break out of the inner while loop, increment j to assign the current character and its count. This will resolve the issue brought up in the for loop approach above.

Time Complexity: O(n)


