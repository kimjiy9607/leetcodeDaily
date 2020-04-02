import java.util.*;
public class IntersectionofTwoLL{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB==null) return null;
        int cntA=0; int cntB=0;
        ListNode a = headA;
        ListNode b = headB;
        while(a!=null){
            cntA++;
            a = a.next;
        }
        while(b!=null){
            cntB++;
            b = b.next;
        }
        a = headA;
        b = headB;
        //int max = 0;
        if(cntA>cntB){
            int max = cntA-cntB;
            while(max>0){
                a = a.next;
                max--;
            }
        }
        if(cntB>cntA){
            int max = cntB-cntA;
            while(max>0){
                b = b.next;
                max--;
            }
        }
        while(a!=b){
            a = a.next;
            b = b.next;
        }
        return a;
    }
}