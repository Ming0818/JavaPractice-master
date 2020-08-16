package offercode.Arrarys;

public class offer_10 {

    /**
     * 二进制中1的个数
     * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
     */

    public static void main(String[] args) {

        System.out.println(NumberOf1(2));
        System.out.println(NumberOf1(5));
        System.out.println(NumberOf1(7));

    }

    public static int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
