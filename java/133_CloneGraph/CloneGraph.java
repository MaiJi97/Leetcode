class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        List<Node> nodes = findNodesByBFS(node);
        Map<Node,Node> map = copyNodes(nodes);
        copyEdges(nodes, map);
        return map.get(node);
    }
    
    public List<Node> findNodesByBFS(Node node) { // Find all the nodes
        Queue<Node> queue = new ArrayDeque();
        Set<Node> visited = new HashSet<>();
        queue.offer(node);
        visited.add(node); // 入队时标记为访问
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            for (Node neighbor : curr.neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor); // 入队时标记为访问
                    queue.offer(neighbor);
                }
            }
        }
        return new LinkedList<>(visited);
    }
    
    public Map<Node, Node> copyNodes(List<Node> nodes) { // copy all the nodes
        Map<Node, Node> map = new HashMap<>();
        for (Node node : nodes) {
            map.put(node, new Node(node.val));
        }
        return map;
    }
    
    public void copyEdges(List<Node> nodes, Map<Node,Node> map) { // copy all the edges
        for (Node node : nodes) {
            Node newNode = map.get(node);
            for (Node neighbor : node.neighbors) {
                Node newNeighbor = map.get(neighbor);
                newNode.neighbors.add(newNeighbor);
            }
        }
    }
}
