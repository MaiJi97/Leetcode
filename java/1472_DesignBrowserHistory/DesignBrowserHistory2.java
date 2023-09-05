class ListNode {

    public String data;
    public ListNode previous;
    public ListNode next;

    public ListNode (String data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}

class BrowserHistory {

    ListNode current;

    public BrowserHistory(String homepage) {
        this.current = new ListNode(homepage);
    }
    
    public void visit(String url) {
        ListNode next = new ListNode(url);
        current.next = next;
        next.previous = current;
        current = next;
    }
    
    public String back(int steps) {
        while (steps > 0 && current.previous != null) {
            current = current.previous;
            steps--;
        }
        return current.data;
    }
    
    public String forward(int steps) {
        while (steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
        return current.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
