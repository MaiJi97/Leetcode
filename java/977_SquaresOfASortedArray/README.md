
## Method 1: Two Pointers 相向双指针

One pointer going from the beginning of the array, the other pointer going from the end of the array. We also use another pointer going from the end to track the current index of the result array, and add elements to the result array, depending on which value is greater between the square of left number and the square of right number. This third pointer therefore start from the end towards the beginning.

Time Complexity: O(n)
