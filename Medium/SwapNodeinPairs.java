public class SwapNodeinPairs{
    public ListNode swapPairs(ListNode head){
        if(head == null) return null;
        if(head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = dummy;
        while(cur!=null && cur.next!=null){
            prev.next = cur.next;
            cur.next = cur.next.next;
            prev.next.next = cur;
            cur = cur.next;
            prev = prev.next.next;
        }
        return dummy.next;
    }
}