class Solution {
    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))  map.put(arr[i], new ArrayList());
            map.get(arr[i]).add(i);
        }
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[arr.length];
        q.offer(0);
        
        int ret = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int index = q.poll();
                visited[index] = true;

                if (index == arr.length - 1) return ret;
                
                if (index > 0 && !visited[index - 1]) {
                    q.offer(index - 1);
                }
                if (index < arr.length - 1 && !visited[index + 1]) {
                    q.offer(index + 1);
                }
                if (map.containsKey(arr[index])) {
                    for (int idx : map.get(arr[index])) {
                        if (visited[idx]) continue;
                        q.offer(idx);
                    }
                    map.remove(arr[i]);
                }
            }
            ret++;
        }

        return -1;
    }
}
