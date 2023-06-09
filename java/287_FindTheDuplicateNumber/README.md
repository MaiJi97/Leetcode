## Method 1: Binary Search

Since the problem needs to be solved without modifying the original array, and using constant space, so we cannot sort the array / use hashset to find the duplicate. Since there the n+1 numbers are in range [1, n] with only one duplicate, we can use binary search to determine if the duplicate is in the first
half range from 1 to n/2 or from n/2 to n.

Eg: 1, 3, 4, 2, 2 </br>
mid = 0 + (4-0)/2 = 2 so there should be 2 elements smaller or equal to 2, and other elements greater than 2. </br>
If we iterate through the array and find 3 elements smaller than or equal to 2, then we know that the duplicate must be smaller than or equal to mid 2, so we can cut off the second half of the elements and find the duplicate only in the elements that are smaller than or equal to mid, that is [left, mid-1]. [mid+1, right] otherwise.

Time Complexity: O(nlogn)

## Method 2: Cycle Detection

This solution is extended from problem 142 cycle detection but with array instead of linked list. Our aim is to find the start of the cycle which will be the duplicate in this problem.

<img width="630" alt="Screen Shot 2023-01-02 at 4 30 36 PM" src="https://user-images.githubusercontent.com/106039830/210282454-9cffe875-3cd4-4e8a-9e9e-5d947038471b.png">

Time Complexity: O(n)

## Method 3: Number index mapping + Negative Marking 

The does not satisfy the requirement but is also a good method. We apply the idea that number of the array can be mapped to distinct index if there are no duplicate. Though if there is a duplicate, there can be two numbers mapping to the same index.

Eg: 1, 3, 4, 2, 2 </br>

The numbers is from 1 to 4, with a duplicate 2. If there is no duplicate, each number can be mapped to an index from 0 to 3. But since there is a duplicate in the numbers, there is also an index that appears twice. In this case the index are 0, 2, 3, 1, 1, with a duplicate index 1 (a duplicate index instead of increment to 4, since this is a mapping). So if we iterate through the array to access each index and find that we access an index twice, we know the number index+1 appears twice. How do we know we access a number at an index more than once? We can negate the number to mark it so if we see a negative number at the index we know we have already visited it.

Time Complexity: O(n)

## Method 4: Sort and iterate
Another way is to sort the array and iterate through it until we find two adjacent same numbers.

Time Complexity: O(n)

## Method 5: Hash Set
Another way is to use a Hash Set to store elements of the array until the add method returns false.

Time Complexity: O(n)
