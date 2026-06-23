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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> p1 = new LinkedList<>();
        Queue<TreeNode> p2 = new LinkedList<>();

        p1.add(p);
        p2.add(q);

        while(!p1.isEmpty() && !p2.isEmpty()){
    
            TreeNode nodeP = p1.poll();
            TreeNode nodeQ = p2.poll();

            if (nodeP == null && nodeQ == null) continue;
            if (nodeP == null || nodeQ == null || nodeP.val != nodeQ.val){
                return false;
            }

            p1.add(nodeP.left);
            p1.add(nodeP.right);
            p2.add(nodeQ.left);
            p2.add(nodeQ.right);
        }
        return true;
    }
}
