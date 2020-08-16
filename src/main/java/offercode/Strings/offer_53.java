package offercode.Strings;

public class offer_53 {

    /**
     * 正则表达式匹配
     * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'
     * 表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
     * 在本题中，匹配是指字符串的所有字符匹配整个模式。
     * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
     */

    public static void main(String[] args) {
        char[] str = {'a', 'a', 'a'};
        char[] pat = {'a', 'b', '*', 'a', 'c', '*', 'a'};
        System.out.println(match(str, pat));
    }

    public static boolean match(char[] str, char[] pattern) {
        boolean result = judge(str, 0, pattern, 0);
        return result;
    }

    public static boolean judge(char[] str, int i, char[] pattern, int j) {
        int m = str.length;
        int n = pattern.length;
        if (i==m && j==n) return true;
        if (i<m && j==n) return false;
        if (i==m && j<n) {
            if (j+1<n && pattern[j+1]=='*') {
                return judge(str, i, pattern, j+2);
            } else {
                return false;
            }
        }

        char a=str[0], b=pattern[0], c='a';
        if (j+1 < n) c = pattern[j+1];
        if (c != '*') {
            if (a==b || b=='.') return judge(str, i+1, pattern, j+1);
            else return false;
        } else if (a==b || b=='.') {
            return judge(str, i+1, pattern, j) || judge(str, i, pattern, j+2);
        } else {
            return judge(str, i, pattern, j+2);
        }
    }
}
