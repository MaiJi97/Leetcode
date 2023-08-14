## Method 1: Two Pointers 相向双指针

Similar to problem 259 Three Sum Smaller, with minor tweaks. First sort the array. Then use a for loop to track the longest side from right to left, and apply the two pointers approach on the subarray before it to track through the two shorter sides, and increment / decrement the two pointers to build the triangles. That is, if the sum of the two shorter sides is greater than the longer side / we already satisfy the condition, add (right - left) to the result and decrement right pointer; if the sum of the two shorters sides is less than the longer side, increment left pointer.

Two Pointers相向双指针的巧妙在于，我们可以通过shift left or right pointer,来使当前的值增大or减小，从而满足条件。b本题中我们需要两条短边的和大于第三边，因此将left and right pointer分别指向两条短边，从而shift two pointers来根据最长边调节此和。

The solution does not take into account duplicates either.

Time Complexity: O(n^2)
