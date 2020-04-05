import java.util.*;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        helper(root, res);
        return res;
    }
    private void helper(TreeNode root, List<Integer> res){
        if(root!= null){
            helper(root.left, res);
        }
        res.add(root.val);
        if(root.right!=null){
            helper(root.right, res);
        }
    }
}