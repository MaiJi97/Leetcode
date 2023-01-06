## Method 1: Scanning Line 扫描线

Sort the intervals array by its start time，then iterate through the interval array to check if any pair of adjacent interval has intersection. If there is we can just return false. If none of them has intersection then return true.

Time Complexity: O(nlogn)
