## DFS / Divide and Conquer through recursion

The solution is similar to problem 108, when we convert sorted array list to a balanced binary search tree. In linked list we need to find the midpoint and do a divide and conquer through recursion on the first half of the list and the second half of the list. In order to cut off the linked list (head & slow), we need a prev pointer to set the next of it to null (similar as in problem 148, when we do merge sort on the two lists)

Time complexity: O(n)
