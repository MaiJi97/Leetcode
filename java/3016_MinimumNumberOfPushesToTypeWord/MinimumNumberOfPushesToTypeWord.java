class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            hm.put(word.charAt(i), hm.getOrDefault(word.charAt(i), 0) + 1);
        }
        List[] bucketSort = new List[word.length() + 1];
        for (char key : hm.keySet()) {
            int frequency = hm.get(key);
            if (bucketSort[frequency] == null) {
                bucketSort[frequency] = new ArrayList<>();
            }
            bucketSort[frequency].add(key);
        }
        
        int length = word.length();
        int loop = 1;
        int currentSpace = 8;
        int count = 0;
        for (int i = bucketSort.length - 1; i >= 0; i--) {
            List<Character> frequencyList = bucketSort[i];
            if (frequencyList == null) continue;
            else {
                for (int j = 0; j < frequencyList.size(); j++) {
                    count += loop * i;
                    currentSpace--;
                    if (currentSpace == 0) {
                        loop++;
                        currentSpace = 8;
                    }
                    length -= i;
                    if (length == 0) return count;
                }
            }
        }
        return count;
    }
}
