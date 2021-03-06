## Method 1: Brute Force

Use a nested for loop to look for the two numbers whose sum is the target value <br />
Time Complexity: O(n^2)

## Method 2: Hash (HashMap or HashSet)
Use a map to store the value as key-pair. Key is the number and value is its index. <br />
Need to clarify: is it sorted? is there duplicate? what to return if no solution? <br />
Time Complexity: O(n)

## Method 3: Sort and Find
Sorting an array takes O(nlogn) <br />
Then we can use two pointers or binary search to find the two numbers whose sum is the target value, which takes O(n) or O(nlogn). <br />
Time Complexity: O(nlogn)
