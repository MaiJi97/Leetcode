class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().c == c) {
                int count = stack.peek().frequency;
                if (count + 1 == k) {
                    for (int j = 1; j < k; j++) {
                        stack.pop();
                    }
                }
                else {
                    stack.push(new Node(s.charAt(i), count + 1));
                }
            }
            else {
                stack.push(new Node(s.charAt(i), 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop().c);
        }
        return sb.reverse().toString();
    }

    public class Node {
        char c;
        int frequency;
        public Node(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
        }
    }
}
