## Method 1: Binary Search

We can determine if the duplicate is in the first half of the array or the second half of the array by counting and comparing the number of elements with the mid value. 

Eg: 1, 3, 4, 2, 2</br>
mid = (0 + 4) / 2 = 2 so there should be 2 elements smaller or equal to 2, and other elements greater than 2. </br>
If we count and find that there are 3 elements smaller than or equal to 2, then the duplicate must be smaller than or equal to mid, so we only need to search in the elements that are smaller than or equal to mid.

Time Complexity: O(nlogn)
