package Week04;

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

class B003 {

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeavesRec(root, 1);
        return sum;
    }
    
    public void sumOfLeftLeavesRec(TreeNode node, int check) {

        if(node != null) {
            
            if(check == 0 && (node.left ==null && node.right ==null))
                sum += node.val;
    
            sumOfLeftLeavesRec(node.left, 0);
            sumOfLeftLeavesRec(node.right, 1);
        }
    }
}
