package offercode.BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class offer_23 {

    /**
     * 从上往下打印二叉树
     * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
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

        System.out.println(PrintFromTopToBottom(node));
    }

    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        if(root==null) return res;

        deque.add(root);
        while(!deque.isEmpty()){
            TreeNode node = deque.getFirst();
            deque.pollFirst();
            res.add(node.val);

            if(node.left!=null) deque.addLast(node.left);
            if(node.right!=null) deque.addLast(node.right);
        }

        return res;
    }


}
