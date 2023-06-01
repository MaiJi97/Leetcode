## Method 1: Union Find

Intuition is that each number in the array belongs to an element that represents the boundary index of a group of consecutive numbers. For example, for {1, 2, 3, 4, 5}, both 1 and 3 have index 4 as their root parent in the union find as 5 (index 4) is the boundary of the consecutive number set they belong to. As we iterate through the array, we check the number's left and right adjacent numbers and see if they are also in the hash map and have the same root parent. If not, we need to merge (union) them. 

Time Complexity: O(n)
