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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
     List<List<Integer>>res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
         if (root == null) {
            return res;
        }
        q.offer(root);

        boolean reverse = false;

        while(!q.isEmpty()){
            int size = q.size();
           
            List<Integer>list = new ArrayList<>();
            while(size>0){
             TreeNode t = q.poll();
                list.add(t.val);
                
                 if(t.left!=null){
                    q.offer(t.left);
                }
                if(t.right!=null){
                    q.offer(t.right);
                }
            size--;
            }
            if(reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;

            res.add(list);
        }
        
        return res;
    }
}