## Method 1: Iterative - Pointers

Make use of current pointers and previous pointers to track the reference of different nodes.

Time Complexity:

Get: O(n) </br>
Insert at Head: O(1) </br>
Insert at Tail: O(n) </br>
Insert at Index: O(n) or O(k) </br>
Delete at Index: O(n) or O(k) </br> 

TODO: implement for doubly linked list, for insert / delete new node, we can approach from front / end depending on if the given index
is closer to front or end.

Time Complexity:

Get: O(n) </br>
Insert at Head: O(1) </br>
Insert at Tail: O(1) </br>
Insert at Index: min(k, n - k) </br>
Delete at Index: min(k, n - k) </br>
