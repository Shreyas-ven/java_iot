public class SymmetricTree  {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        // Both nodes are null
        if (t1 == null && t2 == null) {
            return true;
        }

        // One node is null
        if (t1 == null || t2 == null) {
            return false;
        }

        // Check values and mirror structure
        return (t1.val == t2.val)
                && isMirror(t1.left, t2.right)
                && isMirror(t1.right, t2.left);
    }
}