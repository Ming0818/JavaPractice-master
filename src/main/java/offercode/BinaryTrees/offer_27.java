package offercode.BinaryTrees;

public class offer_27 {

    /**
     * 二叉搜索树与双向链表
     * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
     * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
     */

    private static TreeNode pre = null;

    public static void main(String[] args) {

        TreeNode node = new TreeNode(10);
        TreeNode t1 = new TreeNode(6);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(12);
        TreeNode t7 = new TreeNode(14);

        node.left = t1;
        node.left.left = t2;
        node.left.right = t3;
        node.left.left.left = t4;

        node.right = t5;
        node.right.left = t6;
        node.right.right = t7;

        System.out.println(Convert(node).val);

    }

    public static TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        Convert(pRootOfTree.left);
        if (pre != null) {
            pRootOfTree.left = pre;
            pre.right = pRootOfTree;
        }
        pre = pRootOfTree;
        Convert(pRootOfTree.right);
        return pre;
    }

}
