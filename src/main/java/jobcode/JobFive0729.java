package jobcode;

import java.util.*;

public class JobFive0729 {

    /**
     * 各不相同
     * 我们希望一个序列中的元素是各不相同的，但是理想和现实往往是有差距的。现在给
     * 出一个序列A,其中难免有些相同的元素，现在提供了一种变化方式，使得经过若干
     * 次操作后一定可以得到一个元素各不相同的序列。
     * 这个操作是这样的，令x为序列中最小的有重复的数字，你需要删除序列左数第一个
     * x,并把第二个x替换为2*x.
     * 请你输出最终的序列。
     * 例如原序列是［2,2,1,1,1],一次变换后变为［2,2,2,1],两次变换后变为［4,2,1],变换结束
     * @param n
     * @param arr
     */

    public static void diffenceNumber(int n, int[] arr) {
        //int[] arr = {5, 5, 5, 5, 4};

    }

    //main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        diffenceNumber(n, nums);
    }

}
