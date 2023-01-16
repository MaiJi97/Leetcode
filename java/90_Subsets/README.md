## Method 1: DFS / Traverse through recursion + Sorting

Same as problem 78 Subsets I, but since there can be duplicates in the nums array, we want to eliminate all the duplicate subsets. For example, if nums is [1, 2, 2, 3, 4], we only want to use one of the duplicate 2's and call the method recusively on the elements after 2's since [1, 2(1), 3] and [1, 2(2), 3] are counted as the same. Moreover, we would want to use the first appearance of the duplicate 2's since we want to count those subsets with both 2's in them such as [1, 2, 2]. So let's first sort the nums array, and do DFS only once on the first appearance of a number and skip all other duplicates elements for the recursive call. A problem here is how to skip the duplicate elements:

<img width="560" alt="Screen Shot 2023-01-14 at 3 32 28 PM" src="https://user-images.githubusercontent.com/106039830/212497940-6cd0b7cf-d29a-4471-b285-b2919accaf17.png">


Time Complexity: O(n * 2^n)
