package jobcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * author: YK.Leo
 * date: 2020/7/22, 17:06
 * version: 1.0
 **/

public class GangAOE02 {
    public static int bitMonster(){
        Scanner sc = new Scanner(System.in);
        int nGroup = sc.nextInt();
        int bitRange = sc.nextInt();
        String none = sc.nextLine();
        int[][] indexAndMonster = new int[nGroup][2];
        for (int i = 0; i < nGroup; i++) {
            String str = sc.nextLine();
            indexAndMonster[i][0] = Integer.parseInt(str.split(" +")[0]);
            indexAndMonster[i][1] = Integer.parseInt(str.split(" +")[1]);
        }
        int maxRound = 0;
        // int len = indexAndMonster.length;
        int len = nGroup;
        // 范围小于2*bitRange，全在攻击范围内，取最大即可
        if(indexAndMonster[len-1][0]-indexAndMonster[0][0]<bitRange*2+1){
            for (int[] eles : indexAndMonster) {
                maxRound = Math.max(maxRound,eles[1]);
            }
            return maxRound;
        }
        // 固定长度为bitRange的窗口，向右滑动
        // 消灭完窗口最左边的则向右移动，直到left遇到下一个monster
        Arrays.sort(indexAndMonster, (a, b) -> Integer.compare(a[0], b[0]));
        int left=0,right=1;
        while(left<len){
            while(right<len && indexAndMonster[right][0]<indexAndMonster[left][0]+bitRange*2+1) {
                right++;
                // System.out.println(right);
            }
            while(indexAndMonster[left][1]>0){
                for(int i=left;i<right;i++){
                    indexAndMonster[i][1]--;
                }
                // System.out.println(indexAndMonster[left][1]);
                maxRound += 1;
            }
            left++;
            if(right<len)
                right++;
        }
        return maxRound;
    }

    // main
    public static void main(String[] args) {
        int res = bitMonster();
        System.out.println(res);
    }
}

/*
3 5
1 10
10 5
22 3
 */

