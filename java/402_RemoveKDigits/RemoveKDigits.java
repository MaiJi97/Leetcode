class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) return "0";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            // stack is not empty + peek element is smaller than current element + number of replace is less than k
            while (!stack.isEmpty() && num.charAt(i) < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        // can also iterate through the stack and append to sb, then use sb.deleteCharAt(0) in while loop to remove leading zeroes
        
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        String temp = sb.reverse().toString();

        StringBuilder retBuilder = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '0' && retBuilder.length() == 0) continue;
            retBuilder.append(temp.charAt(i));
        }

        return retBuilder.length() == 0 ? "0" : retBuilder.toString();
    }
}
