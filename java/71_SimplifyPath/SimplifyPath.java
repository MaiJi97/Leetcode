class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.isEmpty() || component.equals(".")) continue;
            else if (component.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            }
            else {
                stack.push(component);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
            sb.insert(0, "/");
        }
        return sb.length() > 0 ? sb.toString() : "/";

    }
}
