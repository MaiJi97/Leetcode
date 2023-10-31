class Solution {
    public int maxLength = 0;
    public int maxLength(List<String> arr) {
        dfs(arr, new HashSet<>(), 0);
        return maxLength;
    }

    private void dfs(List<String> arr, HashSet<Character> hs, int index) {
        maxLength = Math.max(maxLength, hs.size());
        if (index == arr.size()) {
	        return;
	    }
        String current = arr.get(index);
        boolean flag = true;
        HashSet<Character> temp = new HashSet<>();
        for (char c : current.toCharArray()) {
            if (hs.contains(c) || temp.contains(c)) {
                flag = false;
                break;
            }
            temp.add(c);
        }
        dfs(arr, hs, index + 1);
        if (flag == true) {
            hs.addAll(temp);
            dfs(arr, hs, index + 1);
            hs.removeAll(temp);
        }
    }
}
