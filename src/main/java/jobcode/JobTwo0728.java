package jobcode;

import java.util.Scanner;

public class JobTwo0728 {

    /**
     * 小王和小刚在一家化工厂上班，厂里有一个巨大的水罐（保证足够大）。这个水罐有一个进水口和一个出水口。小
     * 王控制着进入口的龙头，小刚控制着出水口的龙头。他们每隔1分钟会调整一下各自龙头的进水和出水的速度（每
     * 分钟内流速为匀速）。
     * 已知最开始水罐是空的，第i分钟内流入的水量为m[i]升，流出的水量为n[i]升，请问过了一段时间以后，最后水罐
     * 里面有多少水，以及这段时间内罐内水量的最大值是多少？
     * 输入描述
     * 第一行一个整数k(1《＝k<=100),表示经过k分钟
     * 接下来k行，每行两个整数，分别表示在第k分钟内的出水量m[k]升和进水量n[k]升（0《＝m[k],n[k]<100000)
     * 输出描述
     * 第一行一个整数，表示k分钟后，水罐里的水量升数
     * 第二行一个整数，表示在这k分钟内，水罐里的水量的最大升数
     * 样例输入：
     * 4
     * 0 3
     * 2 5
     * 4 2
     * 4 0
     * 样例输出：
     * 0
     * 6
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        int MAX = 0;
        int res = 0;
        for (int i = 0; i < k; i++) {
            String[] next = sc.nextLine().split(" ");
            int out = Integer.parseInt(next[0]);
            int in = Integer.parseInt(next[1]);
            res += in - out;
            MAX = Math.max(res, MAX);
        }

        System.out.println(res);
        System.out.println(MAX);



    }
}
