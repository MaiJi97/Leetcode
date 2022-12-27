## Method 1: Brute Force

Collect all the nodes value in all the lists into an array, sort the array and generate a new linked list from the sorted array.

Time Complexity: O(nklognk) where n is the number of elements in a list and k is the number of lists.

## Method 2: Priority Queue

We can optimize our solution by making use of the sorted feature of the lists. Let's store lists instead of seperate elements into a priority queue, 
in the order of its first element. As we pop things out and build up our returned list, we always pop out the list whose first element is the smallest. 
Then we add the rest of the list back to the priority queue and repeat the steps.

Time Complexity: O(nklogk)

## Method 3: Divide and Conquer

Similar idea as merge sort. We divide until we have one element in each group left, and then do the merge by calling the method written in problem 21.

Time Complexity: O(nklogk)
