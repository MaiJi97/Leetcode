## Method 1 & 2: Two Pointers 同向双指针 - fast & slow

Two methods are similar - one uses for loop while the other uses while loop. 

For loop - One pointer to iterate through the array, the other pointer to keep track of the last different character. As the element pointed by i is different from the element pointed by j, we increment j to assign the count of the previous element pointed by j, update count, and assign the value pointed by i. However, an issue with this aproach is that we will miss the count of the final character so we will need to do it after we break out of the for loop.

While loop - One pointer to iterate through the array, the other pointer to keep track of the current different character. This will resolve the issue brought up in the for loop approach above.

Time Complexity: O(n)


