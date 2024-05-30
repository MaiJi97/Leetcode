## Method 1: Brute Force - improved

One way is to use brute force, which is a nested for loop to check if a number is prime (no other factors apart from 1 and itself). We can optimize the brute force by making
the inner loop only go up to square root of the number (due to symmetricality). This can reduce the time complexity of the inner loop, but will still result in TLE.

Time Complexity: O(n * sqrt(n))

## Method 2: Sieve of Eratosthenes

<img width="547" alt="Screen Shot 2023-10-12 at 9 07 44 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/a0bf2cb8-bffe-4503-bc46-e16ad96257bf.png">

Time Complexity: O(n)
