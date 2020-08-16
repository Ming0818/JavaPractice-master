package offercode.BinaryTrees;

public class offer_39 {

    /**
     * 二叉树的深度
     * 输入一棵二叉树，求该树的深度。
     * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
     */

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(7);
        TreeNode t7 = new TreeNode(8);

        node.left = t1;
        node.left.left = t3;
        node.left.left.right = t6;

        node.right = t2;
        node.right.left = t4;
        node.right.right = t5;
        node.right.right.left = t7;

        System.out.println(TreeDepth(node));
    }

    public static int TreeDepth(TreeNode root) {

        if (root == null) return 0;

        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);

        int result = Math.max(left, right) + 1;
        return result;
    }
}
