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

    List<Integer>list = new ArrayList<>();
    int res=0;

    public void sum(TreeNode root){

        if(root == null){
            return;
        }

       
        list.add(root.val);

        if(root.left == null && root.right == null){
            int sum =0;
            int size = list.size();
            for(int i =0;i<size;i++){
                sum=sum*10+list.get(i);
            }
             res = sum+res;
            list.remove(list.size()-1);
            return;
        }

        sum(root.left);
        sum(root.right);
        list.remove(list.size()-1);
    }
    public int sumNumbers(TreeNode root) {
        sum(root);
        return res;
    }
}