package offercode.BinaryTrees;

import java.util.Arrays;

public class offer_24 {

    /**
     * 二叉搜索树的后续遍历数列
     * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
     * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
     */

    public static void main(String[] args) {

        int[] arr = {4,8,6,12,16,14,10};
        System.out.println(VerifySquenceOfBST(arr));

    }

    public static boolean VerifySquenceOfBST(int [] sequence) {
        int len = sequence.length;
        if(sequence==null || len==0) return false;

        int root = sequence[len-1];
        int i = 0;
        for(; i<len-1; i++){
            if(sequence[i]>root) break;
        }
        int j = i;
        for(; j<len-1; j++){
            if(sequence[j]<root) return false;
        }

        boolean left=true, right=true;
        if(i>0) left = VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        if(i<len-1) right = VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,len-1));
        return left && right;
    }

}
