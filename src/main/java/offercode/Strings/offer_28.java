package offercode.Strings;

import java.util.ArrayList;

public class offer_28 {

    /**
     * 字符串的排列
     * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,
     * 则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
     * 输入描述:
     * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
     */

    public static void main(String[] args) {
        String str = "abcb";
        System.out.println(Permutation(str));

    }


    public static ArrayList<String> list = new ArrayList<String>();

    public static ArrayList<String> Permutation(String str) {
        if (str==null || str.length()==0) return list;
        String[] arr = str.split("");
        ArrayList<String> arrLis = new ArrayList<String>();
        for (String s : arr) arrLis.add(s);
        StringBuilder sb = new StringBuilder();

        add(arrLis, sb);

        return list;
    }

    public static void add(ArrayList<String> arr, StringBuilder sb){

        // 当等于str大小是1时，说明遍历到最后一个元素，存到list
        if(arr.size() == 1){
            sb.append(arr.get(0));
            // 判断list中是否有重复，去重
            int i = list.indexOf(sb.toString());
            if(i == -1){
                list.add(sb.toString());
            }
            return;
        }

        // 遍历所有可能情况 abc
        for (int i = 0; i<arr.size(); i++) {
            StringBuilder newSb = new StringBuilder();
            // 把之前路径存下
            newSb.append(sb.toString());
            // 存当前元素a/b/c
            newSb.append(arr.get(i));

            // 确定a/b/c后，删除，下次递归使用剩余元素
            ArrayList<String> temp = new ArrayList(arr);
            temp.remove(i);
            add(temp, newSb);
        }

    }
}
