## Method 1: DFS / Traverse through recursion + Sorting

Same as problem 78 Subsets I but we want to eliminate all the duplicates. A solution is to sort the nums array first, and do DFS only once and skip
all other duplicates elements if there are duplicates. Problem here is how to skip the duplicate elements:

<img width="686" alt="Screen Shot 2023-01-14 at 12 43 41 AM" src="https://user-images.githubusercontent.com/106039830/212459655-c578c281-b620-4fd3-996f-21a13a17c07e.png">

Time Complexity: O(n * 2^n)
