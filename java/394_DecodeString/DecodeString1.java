class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            }
            else if (s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    sb.insert(0, stack.pop());
                }
                String charString = sb.toString();
                stack.pop(); // pop the [
                sb.setLength(0);
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    sb.insert(0, stack.pop());
                }
                String temp = charString.repeat(Integer.parseInt(sb.toString()));
                for (char c : temp.toCharArray()) {
                    stack.push(c);
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();;
        while (!stack.isEmpty()) {
            sb2.insert(0, stack.pop());
        }
        return sb2.toString();
    }
}
