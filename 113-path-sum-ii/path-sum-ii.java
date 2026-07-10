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
     
     List<List<Integer>>res = new ArrayList<>();
     List<Integer>list = new ArrayList<>();

    public void sum(TreeNode root, int targetSum, int sum){

        if(root == null){
            return;
        }

        sum += root.val;
        list.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == targetSum){
               res.add(new ArrayList<>(list));
            }
            list.remove(list.size()-1);
            return;
        }

        sum(root.left, targetSum, sum);
        sum(root.right, targetSum, sum);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

         sum(root, targetSum, 0);
         return res;
    }
}