package offercode.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class offer_55 {

    /**
     * 字符流中的第一个重复的数字
     * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
     * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
     * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
     * 输出描述:如果当前字符流没有存在出现一次的字符，返回#字符。
     */

    private static Map<Character, Integer> map = new HashMap<Character, Integer>();
    private static String input = "";

    public static void main(String[] args) {

        Insert('g');
        Insert('o');
        Insert('o');
        Insert('g');
        Insert('l');
        Insert('e');

        System.out.println(FirstAppearingOnce());
    }

    public static void Insert(char ch) {
        if (!map.keySet().contains(ch)) map.put(ch, 1);
        else map.put(ch, map.get(ch)+1);
        input+=ch;
    }
    //return the first appearence once char in current stringstream
    public static char FirstAppearingOnce() {
        int value = Integer.MAX_VALUE;
        char result = '#';
        for (Character c: map.keySet()) {
            if (map.get(c) == 1) {
                if (input.indexOf(c) < value) {
                    value = input.indexOf(c);
                    result = input.charAt(value);
                }
            }
        }
        return result;
    }
}
