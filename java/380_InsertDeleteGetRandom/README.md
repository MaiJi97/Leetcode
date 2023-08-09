## Method 1: ArrayList + HashMap

Intuition is to use array list, add(e) and get(index) can be done in O(1), though remove(e) and also contains(e) take linear time O(n). How to improve the performance? (HashSet doesn't seem like a better solution, as it does not support getting by index)

Helpful if we can get the index of the element to be removed. We can use a hash map to store both the element and the index of the element in the 
array list as key value pair. 

<img width="666" alt="Screen Shot 2022-12-09 at 5 01 39 PM" src="https://user-images.githubusercontent.com/106039830/206811546-c3cf0f93-7ca1-4fa1-af6d-6ed79042e387.png">

Remove(index) can still take O(n) though, since we will need to move all the elements after the one to be removed one step forward, and also to update
the index of those element in the hash map. What to do now? Best case is when the element to be removed is at the end of the array list, so we can 
swap the element to be removed with the last element in the array list. This will allow 1) remove(index) be done in constant time 2) update only the index
of the orginally last element and remove the current element from the hash map.

