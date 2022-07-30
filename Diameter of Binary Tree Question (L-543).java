class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int curDiameter = maxdepth(root.left) + maxdepth(root.right);
        
        int leftd = diameterOfBinaryTree(root.left);
        int rightd = diameterOfBinaryTree(root.right);
        
        return Math.max(curDiameter , Math.max(rightd, leftd));
    }
    
    public int maxdepth(TreeNode root){
        if(root == null) return 0;
        return 1+ Math.max(maxdepth(root.left), maxdepth(root.right));
    }
}