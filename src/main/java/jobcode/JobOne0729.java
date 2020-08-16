package jobcode;

import java.util.Scanner;

public class JobOne0729 {
    /**
     * 1. 排序算法
     * 题目描述
     * 有一种排序算法定义如下，该排序算法每次只能把一个元素提到序列的开头，例如2,1,3,4,只需要一次操作把1提到
     * 序列起始位置就可以使得原序列从小到大有序。现在给你个乱序的1-n的排列，请你计算最少需要多少次操作才可以使
     * 得原序列从小到大有序。
     * 输入描述
     * 输入第－行包含两个正整数N,表示序列的长度。（1《＝n<=10万）
     * 接下来一行有n个正整数，表示序列中的n个元素，中间用空格隔开。（1《＝a_j<=n)输出描述
     * 输出仅包含一个整数，表示最少的操作次数。
     * 样例输入
     * 4
     * 2 1 3 4
     * 样例输出
     * 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sortArray(n, arr));
    }

    public static int sortArray(int n, int[] arr) {
        int index = n-1;
        while (index>=0) {
            if (arr[index] == n) n--;
            index--;
        }
        return n;
    }


}
