## Method 1: Rotate One Place at a Time - TLE

Rotate one place at a time by appending the last element to the start of the array. Iterate from right to left to replace the current element with the previous element.

Time Complexity: O(k * n)

## Method 2: Rotate Improved

Improved by appending the last k elements to the start of the array all at once. Iterate from right to left to replace the current element with the previous element which is k 
places apart.

Time Complexity: O(n)


