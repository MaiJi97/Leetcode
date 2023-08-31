class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ret = new ArrayList<>();

        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int i = 1; i <= searchWord.length(); i++) {
            String s = searchWord.substring(0, i);
            for (String product : products) {
                if (product.startsWith(s)) pq.offer(product);
            }
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (!pq.isEmpty()) list.add(pq.poll());
            }
            pq.clear();
            ret.add(list);
        }
        return ret;
    }
}
