import java.util.*;

public class NaryTreePre {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null) return ans;
        
        ans.add(root.val);
       // List<Node> arr = root.children;
        for(int i=0; i<root.children.size();i++){
            preorder(root.children.get(i));
        }
        return ans;
    }
}