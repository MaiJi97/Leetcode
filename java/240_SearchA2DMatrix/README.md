## Method 1: Binary Search + Matrix

<img width="943" alt="Screen Shot 2022-08-02 at 6 54 46 PM" src="https://user-images.githubusercontent.com/106039830/182487626-586c8694-990f-42ad-a518-6389ffb63822.png">

We start from the upper right corner or the lower left corner (Eg: upper right corner). If the number is greater than the target, then we decrement the col number; if the number is smaller than the target, then we increment the row number, until we find the number that is equal to the target.

Time Complexity: O(m+n)
