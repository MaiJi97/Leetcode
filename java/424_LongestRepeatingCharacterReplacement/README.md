## Method 1: Two Pointers 同向双指针 - sliding window

<img width="571" alt="Screen Shot 2022-07-24 at 7 10 43 PM" src="https://user-images.githubusercontent.com/106039830/180669709-a233e6b2-5309-4a1d-b46b-e5bfd1a0067a.png">

First, as we don't know which letter will finally compose the longest substring, we need an array to track the number of occurrences of all 26 letters within the window.

If given a substring, if the length of the substring is equal to the number of the most frequently appears letter plus k, then we know this might be a candidate answer. At this point, we can slide the left pointer and look for other candidates.

Time Complexity: O(26 * n)

## Method 2: Two Pointers 同向双指针 - sliding window Improved

Instead of scanning through the frequencies array and get the newest maxCount value each time, we can keep the maxCount value 
monotonically increasing (no change when decrease, but update only when increase). As maxCount + k <= window length, to make the 
window length as large as possible, maxCount also needs to be as large as possible, there is no need to decrease it from a previous
greater value. 

Time Complexity: O(n)
