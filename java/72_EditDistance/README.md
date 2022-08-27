## Method 1: Dynamic Programming

dp[i][j] represents the edit distance of vi and wj, where vi is the prefix of v of length i (substring from the beginning to index i) and wj is the prefix of w of length j (substring from the beginning to index j) </br>

Recurrence relation:
<img width="1116" alt="Screen Shot 2022-08-27 at 5 26 39 PM" src="https://user-images.githubusercontent.com/106039830/187050196-138d7943-6703-483a-b7bc-77fd97dedd5f.png">

Time Complexity: O(mn)

