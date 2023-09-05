class BrowserHistory {

    Stack<String> history;
    Stack<String> future;
    String current;

    public BrowserHistory(String homepage) {
        this.history = new Stack<>();
        this.future = new Stack<>();
        this.current = homepage;
    }
    
    public void visit(String url) {
        history.push(current);
        current = url;
        future = new Stack<>();
    }
    
    public String back(int steps) {
        while (steps > 0 && !history.isEmpty()) {
            future.push(current);
            current = history.pop();
            steps--;
        }
        return current;
    }
    
    public String forward(int steps) {
        while (steps > 0 && !future.isEmpty()) {
            history.push(current);
            current = future.pop();
            steps--;
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
