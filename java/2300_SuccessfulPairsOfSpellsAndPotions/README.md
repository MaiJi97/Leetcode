## Method 1 & 2: Binary Search

For each spell element, we would want to find the element from potions list such that all the potions to the right can have a 
product value with the spell that is greater than success, and all the potions to the left cannot have the product value with the
spell that is greater than success. Binary search should come to mind. We can use either template 2 or template 3.

Time Complexity: O(mlogn)
