package Week02;
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
	
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums == null)
            return null;
    
        return generateBST(nums, 0, nums.length - 1);
    }

    private TreeNode generateBST(int[] nums, int left, int right) {
        
        if(left > right)
            return null;
    
        int middle = (left + right) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        
        node.left = generateBST(nums, left, middle - 1);
        node.right = generateBST(nums, middle + 1, right);
        
        return node;
    }
}