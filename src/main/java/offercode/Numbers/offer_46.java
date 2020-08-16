package offercode.Numbers;

public class offer_46 {

    /**
     * 求1+2+3+...+n
     * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字
     * 及条件判断语句（A?B:C）。
     */

    public static void main(String[] args) {
        System.out.println(Sum_Solution(6));
    }

    public static int Sum_Solution(int n) {
        int sum = n;
        // 递归累加，直到0为止，可用&&来充当if判断，A&&B A非0，执行B; A为0，结束递归
        boolean flag = (sum>0) && ((sum+=Sum_Solution(sum-1))>0);
        return sum;
    }
}
