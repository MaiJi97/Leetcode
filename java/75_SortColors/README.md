## Method 1: Two Pointers 相向双指针

<img width="495" alt="Screen Shot 2022-07-19 at 1 54 12 PM" src="https://user-images.githubusercontent.com/106039830/179817130-3667d4a8-f4ce-45bb-afe4-76d3a68d6432.png">

We set three pointers, one going from the beginning of the array so that numbers from index 0 to left are all 0; one from the end of the array so that numbers from right to (length-1) are all 2; then numbers between pointer left and right are all 1. We also have another pointer i to loop through the array.

As we use pointer i to loop through the array: 
1) If the number is 0, then we increment the pointer left by 1, and swap the numbers pointing by pointer left and pointer j. As we know the number swapped from index left must be 1, we also need to increment pointer i by 1 because we know we are at the end of 1s.
2) If the number is 1, then we simply just increment the pointer i by one.
3) If the number is 2, then we decrement the pointer right by 1, and swap the numbers pointing by pointer right and pointer j. As we do not know what the number swapped from index right is, we do not need to increment pointer i in this case as we still need to go through it.
