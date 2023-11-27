## Method 1: Traditional Binary Search
We can use a traditional binary search to find the index of the target value, and then shift to find the windows / boundaries of the k closest numbers in the array. </br>
This method has a lot of edge cases we will need to consider. </br>

Time Complexity: O(logn + k)

## Method 2: Two Pointers

Continue shifting a left and right pointer to keep a window.

Time Complexity: O(n)

## Method 3: A More Advanced Binary Search
Mid value represents the index of the left boundary of the k closest numbers. The intial boundary is from 0 to arr.length - k </br>

---------|---x----------|----- </br>
If the element at arr[mid] is closer to x than arr[mid + k], then that means arr[mid + k], as well as every element to the right of it can never be in the answer. This means we should move our right pointer to avoid considering them. 

---------|---------x----|----- </br>
The logic is the same vice-versa - if arr[mid + k] is closer to x, then move the left pointer.



