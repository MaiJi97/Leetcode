## Method 1: Stack 

Split the given path by "/" first, and then iterate through each of the element. If the element is "." or "", do nothing. Else if the element is "..", we can discard the last 
element. Else if the element is a valid directory, push it to the stack. Finally we just need to iterate through the stack and concatenate the valid directory names by "/" symbol.

Time Complexity: O(n)
