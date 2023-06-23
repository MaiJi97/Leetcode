## Method 1: Monotonic Deque

A brute force method has time complexity of O(n*k), 

Need to use monotonic deque since we need pop / push from both ends

递减队列: for each element at index i in the array, we make sure elements are kept in a k element window, and they are monotonically decreasing within the window. The first (peekFirst) element in the k element window would be the greatest element corresponding to element at index i which is the last element in the window.

<img width="857" alt="Screen Shot 2023-06-20 at 1 14 33 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/9fbb5162-f057-45ee-ae51-7196ec862554.png">

<img width="867" alt="Screen Shot 2023-06-20 at 2 02 45 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/8e8a790a-d844-4cd7-9545-35dc33bed571.png">

<img width="435" alt="Screen Shot 2023-06-20 at 6 30 45 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/7c3ad19b-880c-421b-9317-222485207104.png">

Time Complexity: O(n)
