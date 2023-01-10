## Method 1: Two Pointers 同向双指针

In this problem we have two arrays so will need two pointers. While we iterate through the two intervals array, we need to check if current interval from 
slots 1 and slot 2 has an intersection that lasts longer than the duration. If there is then return the slot. If it is less than the duration, increment 
current interval from slots 1 or slots 2 depending on which ever ends earlier. Another situation is when current interval from slots 1 and slots 2 does not have an intersection, then increment the interval depending on which one is at the front.

Time Complexity: O(nlogn)

## Method 2: Simplify Method 1

The code from previous method can be simplified.

Time Complexity: O(nlogn)
