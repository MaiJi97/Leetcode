## Method 1: Two Pointers 同向双指针 - fast & slow

For removal, we consider the following three situations when we iterate through the intervals through one pointer: 1) if the interval to be removed does not have any intersection with the current interval, we do not need to do anything, just add the current interval to the list. Why not seperate into cases as in problem 57? Because in problem 57 after merge the interval we not yet add the merged interval to the list and left one step behind. But here we add extras directly during the merge case. 2) if there is intersection, we need to identify if there is extra on the left end or on the right end or both, and add the extra(s) to the list.

<img width="837" alt="Screen Shot 2023-01-09 at 12 20 23 AM" src="https://user-images.githubusercontent.com/106039830/211250611-36918581-3f81-4bec-9393-cf7ed1d6f631.png">

Time Complexity: O(n)

