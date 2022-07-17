class Solution {
    
    List<String> ret = new ArrayList<>();
    Map<Character, String> map = Map.
        of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
        
    public List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        if (digits == null || digits.length() == 0) {
            return ret;
        }
        dfs(digits, 0, sb);
        return ret;
    }
    
    // index为当前DFS要处理的digits[index]所代表的数字
    // combination为目前为主的得到的组合
    public void dfs(String digits, int index, StringBuilder combination) {
        if (combination.length() == digits.length()) {
            ret.add(combination.toString());
            return;
        }
        
        String digit = map.get(digits.charAt(index));
        
        for (int i = 0; i < digit.length(); i++) {
            combination.append(digit.charAt(i));
            dfs(digits, index+1, combination);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}
