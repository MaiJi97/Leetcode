## Method 1: Greedy Algorithm

A brute force method could take O(n^2). To optimized the solution, we do not need to call know() to verify each pair of relationship if we
are only interested in who's the celebrity. For example, if a knows b, a cannot be the celebrity; if a doesn't knwo b, then b cannot be 
the celebrity. So we can use one single round of for loop and eliminate one candidate each time.

<img width="606" alt="Screen Shot 2023-07-18 at 10 24 27 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/e42b42d2-828f-48a6-818b-8c6a2983d146.png">

After we find the final candidate, we still need to verify that the candidate does not know anyone and everyone else knows the candidate, 
to make sure it is indeed the celebrity.

Time Complexity: O(n)
