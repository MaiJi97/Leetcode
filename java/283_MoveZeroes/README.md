## Method 1: Two Pointers 同向双指针

<img width="675" alt="Screen Shot 2022-07-20 at 6 13 27 PM" src="https://user-images.githubusercontent.com/106039830/180091563-06f98eb9-ce6b-4d4c-a768-0309daf2779e.png">

One pointer i to loop through the array, the other pointer j to track the position of index that first zero should appear. As we loop through the array, if the number is non zero, then we swap the number with the number at index j; if the number is zero, then we do nothing. In both cases, we increment pointer i through the for loop.

Time Complexity: O(n)
