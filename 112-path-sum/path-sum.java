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

    boolean found = false;

    public void sum(TreeNode root, int targetSum, int sum){

        if(root == null){
            return;
        }

        sum += root.val;

        if(root.left == null && root.right == null){
            if(sum == targetSum){
                found = true;
            }
            return;
        }

        sum(root.left, targetSum, sum);
        sum(root.right, targetSum, sum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {

        sum(root, targetSum, 0);

        return found;
    }
}
