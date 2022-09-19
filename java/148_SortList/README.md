## Method 1: DFS / Divide and Conquer through recursion - merge sort

This applies the same idea as merge sort an array / divide and conquer. We first divide the linked list into two parts by looking for a midpoint and recursively call the same method. As it reaches the base case we start doing the conquer and merge the two halfs into one by comparing the value of the node the pointer of each part is pointing at. 

Time Complexity: O(nlogn)
