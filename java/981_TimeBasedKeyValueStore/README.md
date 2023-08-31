## Method 1: Binary Search

Can be implemented through a hash map, but the value has to contain both value and its timestamp so we store them in a self-defined
data structure called Object. Then a key in the hash map corresponds to a list of such Objects. In the get method, we first fetch
the list of Objects through the given key and find the Object whose timestamp is smaller than but closest to the given timestamp
through binary search. As we break the while loop, left and right pointers are like (right, left), where left is the index of the 
Object whose timestamp is later than but closest to the given timestamp, and right is the index of the Object whose timestamp is
earlier than but closest to the given timestamp. 

Time Complexity: O(logn)
