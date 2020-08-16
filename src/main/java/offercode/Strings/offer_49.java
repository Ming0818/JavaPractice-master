package offercode.Strings;

public class offer_49 {

    /**
     * 把字符串转化成整数
     * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
     * 数值为0或者字符串不是一个合法的数值则返回0
     */

    public static void main(String[] args) {
        String s1 = "1234556";
        String s2 = "-5242541";
        String s3 = "f2352345";

        System.out.println(StrToInt(s3));
    }

    public static int StrToInt(String str) {
        if(str==null || str.length()==0) return 0;
        boolean isNegative = str.charAt(0) == '-';
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(i==0 && (c=='+' || c=='-')){
                continue;
            }
            if(c<'0' || c>'9') return 0;
            result = result*10 + c-'0';
        }

        if(isNegative == true && (-result) < (-2147483648))
            return 0;
        else if(isNegative == false && result > 2147483647 )
            return 0;

        if(isNegative) result = -result;
        return (int)result;
    }

}
