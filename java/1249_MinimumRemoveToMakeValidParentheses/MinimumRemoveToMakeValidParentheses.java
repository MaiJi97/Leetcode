class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            }
            else if (arr[i] == ')' && !stack.isEmpty()) {
                stack.pop();
            }
            else if (arr[i] == ')' && stack.isEmpty()) {
                arr[i] = '*';
            }
        }
        
        while (!stack.isEmpty()) {
            arr[stack.pop()] = '*';
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c != '*') sb.append(c);
        }
        return sb.toString();
    }
}
