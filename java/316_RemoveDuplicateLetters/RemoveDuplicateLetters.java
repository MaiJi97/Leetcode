class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            int current = s.charAt(i) - 'a';
            if (seen[current]) continue; // if seen continue as we need to pick only one char
            while (!stack.isEmpty() && current < (stack.peek() - 'a') && lastIndex[stack.peek() - 'a'] > i) seen[stack.pop() - 'a'] = false;
            stack.push(s.charAt(i));
            seen[current] = true;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
