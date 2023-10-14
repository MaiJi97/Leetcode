class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {

        HashMap<String, List<String>> graph = new HashMap<>();
        HashMap<String, Integer> inDegree = new HashMap<>();
        HashSet<String> hsRecipes = new HashSet<>();
        HashSet<String> hsSupplies = new HashSet<>();
        for (String recipe : recipes) hsRecipes.add(recipe);
        for (String supply : supplies) hsSupplies.add(supply);
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            List<String> list = ingredients.get(i);
            for (String ingredient : list) {
                if (!graph.containsKey(recipe)) graph.put(recipe, new ArrayList<>());
                if (!graph.containsKey(ingredient)) graph.put(ingredient, new ArrayList<>());
                graph.get(ingredient).add(recipe);
                inDegree.put(recipe, inDegree.getOrDefault(recipe, 0) + 1);
                if (!inDegree.containsKey(ingredient)) inDegree.put(ingredient, 0);
            }
        }
        Queue<String> q = new ArrayDeque<>();
        for (String key : inDegree.keySet()) {
            if (inDegree.get(key) == 0 && hsSupplies.contains(key)) q.offer(key);
        }
        List<String> ret = new ArrayList<>();
        while (!q.isEmpty()) {
            String current = q.poll();
            if (hsRecipes.contains(current)) {
                ret.add(current);
            }
            for (String neighbor : graph.get(current)) {
                inDegree.put(neighbor, inDegree.get(neighbor) - 1);
                if (inDegree.get(neighbor) == 0) q.offer(neighbor);
            }
        }
        return ret;
        
    }
}
