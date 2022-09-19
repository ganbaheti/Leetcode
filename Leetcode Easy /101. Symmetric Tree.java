class Solution {
    public boolean isSymmetric(TreeNode root) {
	    return isSymmetric(root, root);
    }
        public boolean isSymmetric(TreeNode rootleft, TreeNode rootright) {
	    if (rootleft == null && rootright == null) {
		    return true;
	    }
        if ((rootright == null && rootleft != null) || (rootright != null && rootleft == null)) {
		    return false;
	    }
        return (rootleft.val == rootright.val) && isSymmetric(rootleft.left, rootright.right) && isSymmetric(rootleft.right, rootright.left);
    }
}