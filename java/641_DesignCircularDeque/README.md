## Method 1: Implementation using arrays

Similar as problem 622, we need 5 public fields: the array of length k, capacity of the array (for easier computation), the current size of the array, a 
front pointer and a tail / rear pointer. At the beginning, we set the front pointer to point at index 0, which represents the start index of the array. The tail index will 
be front + size - 1, so will be -1 at the beginning. Other methods are similar as in problem 622, but in 622 new element can only be inserted from the 
rear side, so the rear will always be updated first to be greater or equal to 0 before we can remove an element and increment the front pointer. Here element
can be inserted from the front size, so as soon as the queue is not empty we will also need to update the rear pointer from -1 to be the same as the front 
pointer.</br>

<img width="679" alt="Screen Shot 2022-12-22 at 3 48 34 PM" src="https://user-images.githubusercontent.com/106039830/209231914-2ce1820f-4df5-4d30-a72d-a806f4f129c1.png">

If followup on multi-thread, can use lock. Synchronized, volatile, mutex, etc.

Time Complexity: O(1)
