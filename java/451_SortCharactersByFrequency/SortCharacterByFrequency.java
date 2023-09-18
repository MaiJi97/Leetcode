class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character>[] bucketSort = new List[s.length() + 1];
        for (char key : hm.keySet()) {
            int frequency = hm.get(key);
            if (bucketSort[frequency] == null) {
                List<Character> list = new ArrayList<>(); 
                bucketSort[frequency] = list;
            }
            bucketSort[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i >= 0; i--) {
            if (bucketSort[i] != null) {
                for (int j = 0; j < bucketSort[i].size(); j++) {
                    for (int k = 0; k < i; k++) {
                        sb.append(bucketSort[i].get(j));
                    }
                }
            }
        }
        return sb.toString();
      
    }
}
