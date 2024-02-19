## Method 1: Priority Queue (Max & Min Heap)

If we insert an element into its proper position using quick sort / quick select approach, the get median approach could take O(n). We can use two heaps to optimize the solution. We need to create two heaps, a max heap to store first half of the elements (smaller elements), a min heap to store second half of the elements (larger elements). Each time we add a new element, we would want to add it to the correct position (either in max heap or min heap) so the numbers of elements on both heaps are balanced, being equal or differs by at most one. Let's first add it to max heap and take the peek element out of it and offer it to the min heap. If currently the sizes of the two heaps are different, which means the min heap has one more element than the max heap, take the peek element out of it and offer it to the max heap. In the end, the median is either peek of the max heap, or the average of peeks from both heaps.

<img width="557" alt="Screen Shot 2023-07-26 at 1 49 48 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/a9f4b80b-bf6b-4214-b897-e862d4c22b27.png">

Time Complexity: O(logn)
