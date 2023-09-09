class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        int k = 0;
        StringBuilder currentString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            }
            else if (Character.isLetter(c)) {
                currentString.append(c);
            }
            else if (c == '[') {
                countStack.push(k);
                charStack.push(currentString);
                k = 0;
                currentString = new StringBuilder();
            }
            else {
                StringBuilder decodedString = charStack.pop();
                for (int currentK = countStack.pop(); currentK > 0; currentK--) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            }
        }
        return currentString.toString();
    }
}
