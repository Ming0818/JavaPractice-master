package offercode.BinaryTrees;

public class offer_18 {

    /**
     * 树的子结构
     * 输入两棵二叉树A，B，判断B是不是A的子结构。
     * （ps：我们约定空树不是任意一个树的子结构）
     */

    public static void main(String[] args) {

    }

    public static boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return false;
        if(root1.val==root2.val){
            if(judge(root1,root2)) return true;
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public static boolean judge(TreeNode root, TreeNode subroot){

        if(subroot==null) return true;
        if(root==null) return false;

        if(root.val==subroot.val){
            return judge(root.left,subroot.left) && judge(root.right,subroot.right);
        }
        return false;
    }

}
