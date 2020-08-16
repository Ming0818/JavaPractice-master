package offercode.Numbers;

public class offer_47 {

    /**
     * 不用加减乘除做加法
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     */

    public static void main(String[] args) {
        System.out.println(Add(45, 22));
    }

    public static int Add(int num1,int num2) {
        int result = 0;
        int carry = 0;
        do {
            result = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = result;
            num2 = carry;
        } while (carry != 0);
        return result;
    }
}
