/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int depth=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left_r=maxDepth(root.left);
        int right_r=maxDepth(root.right);
        return 1+Math.max(left_r,right_r);
    

        
    }
}