## Method 1: Monotonic Stack

The difficulty here is that the returned string needs to be lexicographically increasing. So for a string like "bcabc", we will need to keep the "bc" after "a" instead of "bc" before "a". That is saying, even we have "bc" already, as we see "a" and we know that "bc" will appear again later in the string, we will need to replace the first occurrence of "bc" with the second occurrence of "bc". That is, as we iterate through the characters in the string, we always add the current character to the stack, but continuously determine if we want to keep the previous characters or not depending on its relationship with the current character and if it occurs again later. We can use monotonic stack to deal with cases like next greater element, next smaller element, previous greater element, previous smaller element, etc.

<img width="367" alt="Screen Shot 2023-06-15 at 10 01 00 AM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/caef5e9c-b31f-4185-8234-ac270524be4f.png">

当满足while的条件，remove peek element - keep executing the while loop as: stack not empty + peek element is greater than the current element + peek element occurs again later. Pop the peek element out of the stack and push the current element onto the stack to remove
the peek element.

Note we need a seen array to track if we already have certain character. And the returned string through string builder has to be reversed as stack has the latest element on the top.

Time Complexity: O(n)
