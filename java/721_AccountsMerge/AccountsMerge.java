class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Set<String>> g = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        buildGraph(g, emailToName, accounts);
        
        List<List<String>> ret = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        
        for (String email : emailToName.keySet()) {
            if (!visited.contains(email)) {
                visited.add(email);
                List<String> list = new ArrayList<>();
                list.add(email);
                dfs(g, list, email, visited);
                Collections.sort(list);
                list.add(0, emailToName.get(email));
                ret.add(list);
            }
        }
        return ret;
    }
    
    private void buildGraph(Map<String, Set<String>> g, Map<String, String> emailToName, List<List<String>> accounts) {
        for (List<String> account : accounts) {
            String name = account.get(0);
            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                g.putIfAbsent(email, new HashSet<>());
                if (i == 1) continue;
                String previous = account.get(i-1);
                g.get(previous).add(email);
                g.get(email).add(previous);
            }
        }
    }
    
    private void dfs(Map<String, Set<String>> g, List<String> list, String email, Set<String> visited) {
        for (String neighbor : g.get(email)) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                list.add(neighbor);
                dfs(g, list, neighbor, visited);
            }
        }
    }
}
