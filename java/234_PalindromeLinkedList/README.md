## Method 1: ArrayList + Two Pointers

Since in linked list it is not quite easy to directly access the index of each element, we can store the elements of the linked list into an array list first
and then use two pointers to determine if it is a palindrome. Time complexity is O(n) but space complexity is also O(n)

Time Complexity: O(n)

## Method 2: Find Midpoint + Reverse Linked List

Another method takes O(1) space. We can find the midpoint first through fast & slow pointers, and then reverse the second half of the linked list. 
Next, just iterate through both linked list at the same speed to determine if the original linked list is a palindrome or not. 

Why not count the length of the linked list and cut it into half through length / 2? Take more effort to consider cases when the number of elements is an 
even number or an odd number.

Time Complexity: O(n)
