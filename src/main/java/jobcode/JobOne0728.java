package jobcode;

import java.math.BigInteger;
import java.util.Scanner;

public class JobOne0728 {

    /**
     * 印度的阿三家里遭遇了一横祸，家人们不幸去世。阿三继承了家人的遗产，一共是x元钱。
     * 上帝怜悯阿三的境遇，每天都会奖励阿三。阿三发现每过一天，自己的钱都会莫名的变多，每天都会增加（px+1)
     * 元这么多钱。
     * 但是阿三数学特别差，那么请你帮他计算一下：
     * 作
     * 问需要多少天阿三的钱会超过10000000000000000.(0《＝x<=1000000000000000000,0<=p<=100)
     * 输入描述
     * 输入为一行，包括两个整数x和p,它们之间以空格相隔开。
     * 1
     * 输出描述
     * 输出只有一行，包括一个整数，表示所需天数。
     * 样例输入：965 10
     * 样例输出：13
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int p = sc.nextInt();

        BigInteger MAX = new BigInteger("10000000000000000");
        BigInteger ONE = new BigInteger("1");
        BigInteger x1 = new BigInteger(String.valueOf(x));
        BigInteger p1 = new BigInteger(String.valueOf(p));

        int count = -1;

        while ( x1.compareTo(MAX) < 0) {
            count++;
            x1 = x1.multiply(p1).add(ONE);
        }
        System.out.println(count);
    }
}
