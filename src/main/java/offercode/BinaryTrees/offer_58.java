package offercode.BinaryTrees;

public class offer_58 {

    /**
     * 二叉树的下一个节点
     * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
     * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
     * 解题思路
     * 中序遍历：左 -> 根 -> 右
     * 分三种情况：
     *   如果当前节点为空，直接返回空；
     *   如果当前节点有右子树，则返回右子树的最左子树；
     *   如果当前节点没有右子树，再分两种情况：
     *     看看当前节点是不是它的父节点的左子树，如果是，则返回它的父节点；
     *     如果当前节点不是它的父节点的左子树，则把父节点赋给当前节点，
     *     再判断当前节点是不是它的父节点的左子树，直到当前节点是不是它的父节点
     *     的左子树，返回它的父节点。
     */

    public static void main(String[] args) {
        TreeLinkNode node = new TreeLinkNode(1);
        TreeLinkNode t1 = new TreeLinkNode(2);
        TreeLinkNode t2 = new TreeLinkNode(3);
        TreeLinkNode t3 = new TreeLinkNode(4);
        TreeLinkNode t4 = new TreeLinkNode(5);
        TreeLinkNode t5 = new TreeLinkNode(6);
        TreeLinkNode t6 = new TreeLinkNode(7);
        TreeLinkNode t7 = new TreeLinkNode(8);
        TreeLinkNode t8 = new TreeLinkNode(9);

        node.left = t1;
        node.left.left = t3;
        node.left.right = t4;
        node.left.left.left = t8;

        node.right = t2;
        node.right.left = t5;
        node.right.right = t6;
        node.right.right.left = t7;

        node.left.next = node;
        node.left.left.next = node.left;
        node.left.right.next = node.left;
        node.left.left.left.next = node.left.left;

        node.right.next = node;
        node.right.left.next = node.right;
        node.right.right.next = node.right;
        node.right.right.left.next = node.right.right;

        System.out.println(GetNext(node.left.right).val);
    }

    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null) {
                node = node.left;
            }
            return node;
        }
        while (pNode.next != null) {
            TreeLinkNode root = pNode.next;
            if (root.left == pNode) return root;
            pNode = root;
        }
        return null;
    }
}
