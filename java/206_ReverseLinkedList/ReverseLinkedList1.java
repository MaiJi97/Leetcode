class Solution {
    public ListNode reverseList1(ListNode head) {
        if(head == null) {
            return null;
        }
        else if(head.next == null) {
            return head;
        }
        else {
            ListNode rest = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return rest;
        }
    }
}
