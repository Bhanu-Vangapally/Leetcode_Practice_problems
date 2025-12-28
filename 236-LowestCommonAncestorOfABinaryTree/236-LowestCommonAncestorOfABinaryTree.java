// Last updated: 12/28/2025, 4:53:49 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val==p.val || root.val==q.val) return root;
        TreeNode lf=lowestCommonAncestor(root.left,p,q);
        TreeNode rf=lowestCommonAncestor(root.right,p,q);
        if(lf==null) return rf;
        if(rf==null) return lf;
        return root;

    }
}