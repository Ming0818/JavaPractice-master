package leetcode;

public class code309 {

    public static void main(String[] args) {

        int[] p = {1,2,3,0,2};
        System.out.println(maxProfit(p));
    }

    /**
     给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
     设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
     你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
     卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
     */

    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int oldHave = -prices[0];
        int oldNot = 0;
        int oldSell = 0;
        int nowSell,nowHave,nowNot=0;
        for (int i = 0; i < prices.length; i++) {
            nowSell = prices[i] + oldHave;
            nowNot = Math.max(oldNot, oldSell);
            nowHave = Math.max(oldHave, oldNot - prices[i]);
            oldHave = nowHave;
            oldNot = nowNot;
            oldSell = nowSell;
        }
        return Math.max(oldSell, oldNot);
    }

}
