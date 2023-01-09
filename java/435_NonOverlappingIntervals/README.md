## Method 1: Greedy Approach

Always choose the interval that ends first.

Therefore, sort the intervals by end point and iterate through the intervals, if there is no intersection then do nothing, just update the previous interval
to be the current interval. If there is an intersection, pick the one that ends earlier and update the pointer and counter.

<img width="557" alt="Screen Shot 2023-01-08 at 3 52 45 PM" src="https://user-images.githubusercontent.com/106039830/211371004-e45dd0f7-9269-4057-9bb5-c8d752a04f74.png">

Time Complexity: O(nlogn)
