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
    void fun(TreeNode tptr, ArrayList<Integer> lst){
        if(tptr==null) return;
        fun(tptr.left,lst);
        fun(tptr.right,lst);
        lst.add(tptr.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> lst=new ArrayList<>();
        fun(root,lst);
        return lst;
    }
}