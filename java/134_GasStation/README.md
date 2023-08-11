## Method 1: Greedy Algorithm

Intuitively we can generate an array of same length, where ith element is the value of gas[i] - cost[i]. Then start iterating the new 
array from each index and compute the cumulative sum. Break if the number becomes negative and try a new start index, until we find the
start index that keeps the cumulative sum to be non-negative for the whole cycle of iteration. The approach is O(n^2) which is not good
enough. An optimized approach is to use the greedy algorithm. Always start over from the next index if the current cumulative sum 
becomes negative. At the same time, even if we find an index start from which the cumulative sum of the gains after it is non-negative,
how can we ensure that the gain is enough to support the whole cycle? This is why we need to track the total gain. The journey can be
completed only if the total gain is non-negative.

<img width="611" alt="Screen Shot 2023-08-11 at 1 11 39 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/c49088de-2bfb-4fe1-bac8-294d10e6fccd.png">

Time Complexity: O(n)
