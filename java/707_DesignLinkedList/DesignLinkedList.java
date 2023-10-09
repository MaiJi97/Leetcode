public class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
}

class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        this.head = new ListNode(0);
        this.size = 0;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        ListNode newNode = new ListNode(val);
        ListNode current = head;
        ListNode prev = null;
        while (index > 0) {
            prev = current;
            current = current.next;
            index--;
        }

        if (prev != null) {
            prev.next = newNode;
            newNode.next = current;
        
        }
        else { // index is 0
            newNode.next = current;
            head = newNode;
        }

        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index >= size) return;
        ListNode current = head;
        ListNode prev = null;
        while (index > 0) {
            prev = current;
            current = current.next;
            index--;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        else { // index is 0
            head = head.next;
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
