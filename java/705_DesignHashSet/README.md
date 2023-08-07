## Method 1: HashSet through ArrayList

Time Complexity: </br>
add(): O(n) </br>
remove(): O(n) </br>
contains(): O(n) </br>

## Method 2: HashSet through Array

Time Complexity: </br>
add(): O(1) </br>
remove(): O(1) </br>
contains(): O(1) </br>
Restriction is that the capacity is not flexible

## Method 3: HashSet through array of Bucket (Linked List)

<img width="490" alt="Screen Shot 2023-08-06 at 3 38 17 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d45e8e61-1e5a-4890-80c3-fb51ef294ea9.png">


Time Complexity: </br>
add(): O(n/k) where k is 769 </br>
remove(): O(n/k) </br>
contains(): O(n/k) </br>

## Method 4: HashSet through array of Bucket (BST)

We can further optimize the solution by using BST in each bucket instead of linked list. So time complexity of searching within the bucket can be shortent to O(logn) instead of O(n).

<img width="508" alt="Screen Shot 2023-08-06 at 3 55 48 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/7ee46bdc-3d4f-48d7-8c36-87db4c08d37c.png">

Time Complexity: </br>
add(): O(log(n/k) where k is 769 </br>
remove(): O(log(n/k)) </br>
contains(): O(log(n/k)) </br>

