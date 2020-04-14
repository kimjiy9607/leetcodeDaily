import java.util.*;

public class PopulatingNextRightPointers {
    public TreeNode connect(TreeNode root){
        if(root==null) return null;
        TreeNode dummy = new TreeNode(0);
        TreeNode prev = dummy;
        TreeNode head = root;
        while(head!=null){
            TreeNode cur = head;
            while(cur!=null){
                if(cur.left!=null){
                    prev.next = cur.left;
                    prev = prev.next;
                }
                if(cur.right!=null){
                    prev.next = cur.right;
                    prev = prev.next;
                }
                cur = cur.next;
            }
            head = dummy.next;
            dummy.next = null;
            prev = dummy;
        }
        return root;
    }
}