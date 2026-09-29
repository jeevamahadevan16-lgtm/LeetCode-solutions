
class Solution {
    
  void fun(TreeNode tptr,ArrayList<Integer> lst){
    if(tptr==null) return;
    lst.add(tptr.val);
    fun(tptr.left,lst);
    fun(tptr.right,lst);
 }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> lst=new ArrayList<>();
        fun(root,lst);
        return lst;
    }
}