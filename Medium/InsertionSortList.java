
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head){
        ListNode p = head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode f = null;
        while(p!=null){
            f = p.next;
            while(prev.next!=null && prev.next.val < p.val){
                prev = prev.next;
            }
            p.next = prev.next;
            prev.next = p;
            p=f;
            prev=dummy;
        }
        return dummy.next;
    }
}