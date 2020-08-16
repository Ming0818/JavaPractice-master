package offercode.BinaryTrees;

import java.util.ArrayList;

public class offer_25 {

    /**
     * 二叉树中和为某一值的路径
     * 输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     */

    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        TreeNode l1= new TreeNode(1);
        TreeNode l2 = new TreeNode(2);
        TreeNode l3 = new TreeNode(3);
        node.left = l1;
        node.right = l2;
        node.left.left = l3;
        node.right.left = l3;


        /*ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(4);

        ArrayList<Integer> arr2 = new ArrayList<Integer>(arr1);
        System.out.println(arr2);*/

    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();

        if(root==null) return results;

        ArrayList<Integer> path = new ArrayList<Integer>();
        this.find(root, target, results, path);

        return results;
    }

    private void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> results,
                      ArrayList<Integer> path){
        if(root==null) return;

        path.add(root.val);
        target -= root.val;

        if(target < 0) return;

        if(target==0 && root.left==null && root.right==null) {
            results.add(path);
            return;
        }

        this.find(root.left, target, results, new ArrayList<Integer>(path));
        this.find(root.right, target, results, new ArrayList<Integer>(path));

    }

}
