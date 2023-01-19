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

class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
	    this.left = left;
	    this.right = right;
	}
    
    int sum = 0;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        traverse(root, low, high);
        
        return sum;
    }

    void traverse(TreeNode newRoot, int newLow, int newHigh){
        
        if(newRoot == null)
            return;
        
        if(newRoot.val >= newLow && newRoot.val <= newHigh)
            sum += newRoot.val;
        
        traverse(newRoot.left, newLow, newHigh);

        traverse(newRoot.right, newLow, newHigh);
    }
}
