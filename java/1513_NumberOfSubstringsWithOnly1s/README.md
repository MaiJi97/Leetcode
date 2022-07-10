## Method 1: One Pointer
00111000011 </br>
111 contains 1 + 2 + 3 = 6 substrings of only 1s </br>
11 contains 1 + 2 = 3 substrings of only 1s </br>
Just need one pointer i to loop through the string, and as there is a consecutive substring of 1s, we add 1 to the counter and add the count to the result.

Time Complexity:
O(n)
