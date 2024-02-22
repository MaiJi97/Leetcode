class Solution {
    public int minStickers(String[] stickers, String target) {
        HashMap<String, HashMap<Character, Integer>> map = new HashMap<>();

        for (String sticker : stickers) {
            HashMap<Character, Integer> stickerMap = new HashMap<>();
            for (int i = 0; i < sticker.length(); i++) {
                char c = sticker.charAt(i);
                stickerMap.put(c, stickerMap.getOrDefault(c, 0) + 1);
            }
            map.put(sticker, stickerMap);
        }
        int ret = helper(stickers, target, map, new HashMap<>());
        return ret < 1 || ret >= Integer.MAX_VALUE ? -1 : ret;
    }

    public int helper(String[] stickers, String target, HashMap<String, HashMap<Character, Integer>> map, HashMap<String, Integer> memo) {
        if (target.length() == 0) return 0;
        if (memo.containsKey(target)) return memo.get(target);
        int ret = Integer.MAX_VALUE;
        for (String sticker : map.keySet()) {
            HashMap<Character, Integer> stickerMap = new HashMap(map.get(sticker));
            String temp = target;
            char c = temp.charAt(0);
            if (stickerMap.containsKey(c)) {
                for (int i = 0; i < temp.length(); i++) {
                    c = temp.charAt(i);
                    if (stickerMap.containsKey(c) && stickerMap.get(c) > 0) {
                        stickerMap.put(c, stickerMap.get(c) - 1);
                        temp = temp.substring(0, i) + temp.substring(i + 1);
                        i--;
                    }
                }
                if (temp.length() != target.length()) {
                    ret = Math.min(ret, 1 + helper(stickers, temp, map, memo));
                    memo.put(target, ret);
                }
            }
        }
        return ret;
    }

}
