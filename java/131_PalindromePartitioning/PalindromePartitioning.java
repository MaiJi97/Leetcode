class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ret = new ArrayList<>();
        dfs(s, new ArrayList<>(), ret, 0);
        return ret;
    }

    public void dfs(String s, List<String> currentList, List<List<String>> ret, int index) {
        if (index == s.length()) {
            ret.add(new ArrayList<>(currentList));
            return;
        }
    
        for (int end = index; end < s.length(); end++) {
            if (isPalindrome(s, index, end)) {
                currentList.add(s.substring(index, end + 1));
                dfs(s, currentList, ret, end + 1);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
