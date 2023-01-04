## Method 1: Brute Force

First need to understand the description of the problem. We are not compare the values in the two linked list and find the earliest point we satisfy
headA.val == headB.val. Instead the problem compares the reference of pairs of nodes to find the intersection, that is headA == headB. A brute force method
is to use nested loops to compare each pair of nodes from the two linked list. This method takes O(mn) which is not efficient.

Time Complexity: O(mn)

## Method 2: Hash Set

An improved method is to loop through one of the linked list and store each node in a hash set. Then use another loop to check if each node in the other
linked list is in the hash set.

Time Complexity: O(m)

## Method 3: Pointers - Iterative

Using hash set needs linear space, is there a way we can save it and use constant space instead? We can compute the difference in length between the two
linked list. Assume the difference is d. Then set a pointer to iterate through the longer linked list first (go d steps ahead). Next we can use another pointer
to iterate through the shorter linked list at the same speed as the longer one so that the two pointers complete at the same time. Each time we move one step
forward we compare the two nodes to see they are same / we reach the intersection.

Time Complexity: O(m)
