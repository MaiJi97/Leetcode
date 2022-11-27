## Method 1: Brute Force

Intuitively, just iterate through each tuple, and then loop from start index to end index to do addition on corresponding element.

Time Complexity: O(n * k)

## Method 2: Prefix Sum

We can solve the problem in a faster way. For each tuple, we can add the value to the start index, and deduct the value from the end index + 1.

Input: [1, 3, 2], [0, 2, 3]

[0, 0, 0, 0, 0] 

[0, 2, 0, 0, -2]

[3, 2, 0, -3, -2]

Then each value in the final array to be returned arr[i] = arr[i] + arr[i-1]: [3, 5, 5, 2, 0]

Time Complexity: O(n + k)
