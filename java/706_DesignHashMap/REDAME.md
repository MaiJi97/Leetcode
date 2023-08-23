## Method 1: HashSet through array of Bucket (Linked List)

Similar as in problem 705, the implementation of hash map. Difference is that instead of storing a single integer, we are now storing 
a key value pair. 

<img width="461" alt="Screen Shot 2023-08-23 at 8 50 48 AM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/99c953f0-2d21-4b8f-b219-1ba7eee56312.png">

Time Complexity: </br>
add(): O(1) </br>
remove(): O(n/k) where k is 769  </br>
contains(): O(n/k) where k is 769 

