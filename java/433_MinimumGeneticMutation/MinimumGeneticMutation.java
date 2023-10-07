class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<String> q = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        q.offer(startGene);
        visited.add(startGene);
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String current = q.poll();
                if (current.equals(endGene)) return count;
                for (int j = 0; j < startGene.length(); j++) {
                    for (char c = 'A'; c <= 'Z'; c++) {
                        StringBuilder sb = new StringBuilder(current);
                        sb.setCharAt(j, c);
                        String newGene = sb.toString();
                        if (Arrays.asList(bank).contains(newGene) && !visited.contains(newGene)) {
                            q.offer(newGene);
                            visited.add(newGene);
                        } 
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
