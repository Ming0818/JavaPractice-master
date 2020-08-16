package offercode.Strings;

public class offer_04 {

    /**
     * 替换空格
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     */

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));

    }

    public static String replaceSpace(StringBuffer str) {

        StringBuffer res = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c==' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
