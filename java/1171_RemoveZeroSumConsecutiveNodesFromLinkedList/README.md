## Method 1: Prefix Sum + Hash Map

Note that we need to remove consecutive elements that sum to zero. That reminds us of prefix sum, ie: s(a) == s(b) indicates that the sum of elements between
a and b is zero. So we can iterate through the list and use a map to store each prefix sum value and the node corresponding to the value (we only need to 
store the latest node to remove all the elements in between with sum of zero). Then we iterate through the list again and link the elements to remove the 
elements in between. Why only need another one pass to remove the elements? Because the result is obtained by removing blocks of elements with no intersection
with each other.

<img width="543" alt="Screen Shot 2023-01-03 at 2 06 58 PM" src="https://user-images.githubusercontent.com/106039830/210449218-73b33471-bd40-4911-a0be-706df72c5d1d.png">


Time Complexity: O(n)
