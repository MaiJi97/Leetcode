## Method 1: Binary Search

For each spell element, we would want to find the element from potions list such that all the potions to the right can have a 
product value with the spell that is greater than success, and all the potions to the left cannot have the product value with the
spell that is greater than success. Binary search should come to mind. After we break the while loop, left and right pointers are
like (right, left), where left points to the first element after the boundary that forms product greater than success, and right
points to the first element before the boundary that forms product smaller than success.

Time Complexity: O(mlogn)
