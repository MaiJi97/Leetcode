## Method 1: Priority Queue

A brute force method has time complexity of O(n*k), and a method with priority queue still needs O(nlogn).

## Method 2: Monotonic Deque

Need to use monotonic deque since we need to keep elements within a window -> pop / push from both ends

递减队列: index i is the right boundary of the k element window in the original array, and we find the corresponding maximum value within the window. So, if the gap between i and the peek element is over k, we have to poll element out of the queue from the front; and as we offer element at index i into the queue, we have to make sure they are monotonically decreasing so we poll any smaller elements out of the queue from the tail. 为什么递减？We want the first (peekFirst) element to be the greatest element in the k element window and elements are in the order of potentially maximum.

<img width="857" alt="Screen Shot 2023-06-20 at 1 14 33 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/9fbb5162-f057-45ee-ae51-7196ec862554.png">

<img width="867" alt="Screen Shot 2023-06-20 at 2 02 45 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/8e8a790a-d844-4cd7-9545-35dc33bed571.png">

<img width="435" alt="Screen Shot 2023-06-20 at 6 30 45 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/7c3ad19b-880c-421b-9317-222485207104.png">

<img width="790" alt="Screen Shot 2023-06-23 at 1 28 22 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/74c0e352-4e24-43d4-adc3-e2bc4597ef3e.png">

Time Complexity: O(n)
