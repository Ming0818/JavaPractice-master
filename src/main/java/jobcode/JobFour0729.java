package jobcode;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JobFour0729 {

    /**
     * 种草
     * 杰夫非常喜欢种草，他自己有一片草地，为了方便起见，我们把这片草地看成一行从
     * 左到右，并且第i个位置的草的高度是hi.
     * 杰夫在商店中购买了m瓶魔法药剂，每瓶魔法药剂可以让一株草长高x,杰夫希望每次
     * 都能有针对性的使用药剂，也就是让当前长得最矮的小草尽量高，现在杰夫想请你告
     * 诉他在使用了m瓶魔法药剂之后，最矮的小草在这种情况下最高能到多少。
     * @param n
     * @param m
     * @param x
     * @return
     */

    public static int getShortest(int n, int m, int x, int[] nums){
        if(nums==null || n<=0 || m<=0)
            return 0;
        // 小顶heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            heap.add(nums[i]);
        }
        for (int i = 0; i < m && !heap.isEmpty(); i++) {
            int min = heap.poll();
            heap.add(min+x);
        }
        return heap.isEmpty()?0:heap.peek();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 小草的个数
        int m = sc.nextInt(); // 药剂的个数
        int x = sc.nextInt(); // 草长的高度

        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            ai[i] = sc.nextInt();
        }
        System.out.println(getShortest(n, m, x, ai));
    }

}
