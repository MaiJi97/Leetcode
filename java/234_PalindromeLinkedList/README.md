## Method 1: ArrayList + Two Pointers

Since in linked list it is not quite easy to directly access the index of each element, we can store the elements of the linked list into an array list first
and then use two pointers to determine if it is a palindrome. Time complexity is O(n) but space complexity is also O(n)

Time Complexity: O(n)

## Method 2: Find Midpoint + Reverse Linked List

Another method takes O(1) space. We can find the midpoint first through fast & slow pointers, and then reverse the second half of the linked list. 
Next, just iterate through both linked list at the same speed to determine if the original linked list is a palindrome or not. As we find the midpoint,
the node that the slow pointer is at as the fast pointer finish iterating the start of the second half of the linked list.

<img width="513" alt="Screen Shot 2023-01-03 at 11 22 11 PM" src="https://user-images.githubusercontent.com/106039830/210489664-6fbf0518-1934-4de0-8b91-367b57af586e.png">

Why not count the length of the linked list and cut it into half through length / 2? Take more effort to consider cases when the number of elements is an 
even number or an odd number.

Note that we also don't need to use two additional pointers l1 and l2. We can call next directly on the head node of the two lists, as we do not need to return the original list / track the start of the list as the return.

Followup: If we need to retain the original linked list? If so, call reverse again on the second half of the linked list and link back. We can also use a stack instead, but will need to consider various cases (odd / even number of nodes in the list).

Time Complexity: O(n)
