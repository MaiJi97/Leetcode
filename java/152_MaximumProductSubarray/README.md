## Method 1: Kadane's Algorithm / Greedy Algorithm

Similar approach as in problem 53, but one thing tricky here is that a zero or negative number in the array can cause magic effect. If 
there is a zero, the current subarray product will be reset, and we just need to update the maxSubarray as normal (the greater one 
between currentSubarray * nums[i] and nums[i]). If there is negative numbers - a single negative number can flip the largest 
combo chain to a very small number. This may sound like your combo chain has been completely disrupted but if you encounter another 
negative number, your combo chain can be saved since a small negative number can be converted to a large positive number. Unlike zero, you 
still have a hope of saving your combo chain as long as you have another negative number in nums. Therefore, we need to use another 
variable minSubarray to keep track of the minimum subarray product as it could be potentially become the the maximum subarray product 
as it encounters another negative number. However, if you encounter a zero while you are looking for your another negative number to save
your combo chain, you lose the hope of saving that combo chain.

Time Complexity: O(n)
