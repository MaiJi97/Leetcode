## Method 1: Binary Search

Since the problem needs to be solved without modifying the original array, and using constant space, so we cannot sort the array / use hashset to find the duplicate. Since there the n+1 numbers are in range [1, n] with only one duplicate, we can use binary search to determine if the duplicate is in the first
half range from 1 to n/2 or from n/2 to n.

Eg: 1, 3, 4, 2, 2 </br>
mid = 0 + (4-0)/2 = 2 so there should be 2 elements smaller or equal to 2, and other elements greater than 2. </br>
If we iterate through the array and find 3 elements smaller than or equal to 2, then we know that the duplicate must be smaller than or equal to mid 2, so we can cut off the second half of the elements and find the duplicate only in the elements that are smaller than or equal to mid, that is [left, mid-1]. [mid+1, right] otherwise.

Time Complexity: O(nlogn)

## Method 2: Number index mapping + Negative Marking 

The does not satisfy the requirement but is also a good method. We apply the idea that number of the array can be mapped to distinct index if there are no
duplicate. Though if there is a duplicate, there can be two numbers mapping to the same index.

Eg: 1, 3, 4, 2, 2 </br>

The numbers is from 1 to 4, with a duplicate 2. Each we let each number represents an index, they should be index 0, 2, 3, 1, 1, with a duplciate index 1.
If we access index 1 twice, we know the number index+1 appears twice. How do we know we access a number more than once? We can use negative number to mark 
it so if we see a negative number at the index we know we have already visited it.

Time Complexity: O(n)

## Method 3: Sort and iterate
Another way is to sort the array and iterate through it until we find two adjacent same numbers.

## Method 4: Hash Set
Another way is to use a Hash Set to store elements of the array until the add method returns false.
