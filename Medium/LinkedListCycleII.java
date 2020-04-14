
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head){
        if(head==null||head.next == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                s = head;
                while(s!=f){
                    s = s.next;
                    f = f.next;
                }
                return s;
            }
        }
        return null;
    }
}