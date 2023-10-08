class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String, HashMap<String, Double>> graph = new HashMap<>();
        
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double quotient = values[i];
            if (!graph.containsKey(dividend)) graph.put(dividend, new HashMap<>());
            if (!graph.containsKey(divisor)) graph.put(divisor, new HashMap<>());
            graph.get(dividend).put(divisor, quotient);
            graph.get(divisor).put(dividend, 1 / quotient);
        }

        double[] ret = new double[queries.size()];
        Arrays.fill(ret, -1.0);
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String start = query.get(0);
            String end = query.get(1);
            if (!graph.containsKey(start) || !graph.containsKey(end)) continue;
            Queue<Pair<String, Double>> q = new ArrayDeque<>();
            Set<String> visited = new HashSet<>();
            q.offer(new Pair<>(start, 1.0));
            visited.add(start);
            while (!q.isEmpty()) {
                Pair<String, Double> current = q.poll();
                String key = current.getKey();
                Double value = current.getValue();
                if (key.equals(end)) {
                    ret[i] = value;
                    break;
                }
                if (graph.containsKey(key)) {
                    HashMap<String, Double> hm = graph.get(key);
                    for (String k : hm.keySet()) {
                        if (!visited.contains(k)) {
                            q.offer(new Pair<>(k, hm.get(k) * value));
                            visited.add(k);
                        }
                    }
                }
            }
        }
        return ret;
    }
}
