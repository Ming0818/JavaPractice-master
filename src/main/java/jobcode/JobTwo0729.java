package jobcode;

import java.util.*;

public class JobTwo0729 {

    /**
     * 2. 平行四边形构造
     * 题目描述：
     * 给出你n条长度不一的边，请你从中选择四条边，组成一个最大的平行四边形。请你输出最大的平行四边
     * 形的面积。
     * 输入描述
     * 输入第一行包含一个正整数n,表示边的数量。（4《＝n<=50000)
     * 输入第二行包含n个正整数，表示n条边的长度，边的长度不会超过10^9.
     * 输出描述
     * 输出仅包含一个正整数，即最大的平行四边形的面积，无解则输出－1.
     * 样例输入
     * 5
     * 3 3 4 4 5
     * 样例输出
     * 12
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums = sc.nextInt();
        int[] edges = new int[nums];
        for (int i = 0; i < nums; i++) {
            edges[i] = sc.nextInt();
        }

        System.out.println(areas(edges));

    }

    public static int areas(int[] edges){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < edges.length; i++) {
            if (!map.containsKey(edges[i])) {
                map.put(edges[i], 1);
            } else {
                map.put(edges[i], map.get(edges[i])+1);
            }
        }

        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys, Collections.reverseOrder());
        int l = 0;
        int w = 0;
        int flag = 0;

        for (Object i: keys) {
            // System.out.println(i);
            if (map.get(i) >= 4) {
                l = Math.max((int)i, l);
                w = Math.max((int)i, w);
                break;
            }
            else if (map.get(i) >= 2 && flag < 2) {
                w = l ;
                l = (int) i;
                flag++;
            }
        }
        if (l*w > 0) return l*w;
        else return -1;
    }
}
