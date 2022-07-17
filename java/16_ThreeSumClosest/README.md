## Method 1: Two Pointers 相向双指针
Similar as the 3Sum question, we use a for loop and two pointers to go through the array and increment / decrement the two pointers to get a target value. In addition, we need a variable to track the value that is closest to the target value. </br>
</br>
But in this question, we do not need to worry about duplicates in the result since there is exactly one solution. </br>

Time Complexity: O(n^2)
