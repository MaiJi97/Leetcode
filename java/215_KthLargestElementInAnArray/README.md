## Method 1: Priority Queue

Min heap to store the elements in order. Instead of offering all the elements into the queue and polling to get the kth largest element, we can always keep the number
of elements in the queue within k.

Time Complexity: O(nlogk)

## Method 2: Quick Sort (Quick Select)

Quick select is a selection algorithm to find the kth smallest element in an unordered list. It is related to quick sort algorithm.
Though quick sort requires all the elments to be sorted, quick select only cares about the kth smallest / largest element, without
the need to sort the elements on the left or right of the pivot.

Time Complexity: O(n) on average
