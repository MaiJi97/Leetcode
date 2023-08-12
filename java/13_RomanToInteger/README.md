## Method 1: Hash Map

We need to clarify if the input is valid or not. If the input is guaranteed to be valid, then we can simply iterate over the roman and
look for the number representation of the next one or two characters. If not, an ascending pattern does not guarantee a valid 
substraction use case. Then we need to include the substraction cases in the hash map.

Time Complexity: O(1)
