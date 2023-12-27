class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!charStack.isEmpty() && charStack.peek() == c) {
                int count = countStack.pop();
                if (count + 1 == k) {
                    for (int j = 1; j < k; j++) {
                        charStack.pop();
                    }
                }
                else {
                    charStack.push(s.charAt(i));
                    countStack.push(count + 1);
                }
            }
            else {
                charStack.push(s.charAt(i));
                countStack.push(1);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            sb.append(charStack.pop());
        }
        return sb.reverse().toString();
    }
}
