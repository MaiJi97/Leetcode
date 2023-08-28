## Method 1: Prefix Sum + Hashmap + Negative Marking

Prefix sum套娃题，巧妙之处是use negative marking to convert (1，0) into (1，-1). In this case, if the prefix sums at two index are equal, we know the subarray between the two index has the same number of 1 and 0.

Time Complexity: O(n)
