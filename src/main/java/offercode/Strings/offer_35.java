package offercode.Strings;

public class offer_35 {
    /**
     * 第一个只出现一次的字符串
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
     * 并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     */

    public static void main(String[] args) {
        String str = "abcndjfabcdjfafsdfgv";
        System.out.println(FirstNotRepeatingChar(str));
    }
    public static int FirstNotRepeatingChar(String str) {
        if (str==null || str.length()==0) return -1;

        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
