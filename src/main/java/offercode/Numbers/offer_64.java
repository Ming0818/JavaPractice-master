package offercode.Numbers;

import java.util.ArrayList;
import java.util.Collections;

public class offer_64 {

    /**
     * 数据流中的中位数
     * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，
     * 那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
     * 那么中位数就是所有数值排序之后中间两个数的平均值。
     * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
     */

    private static ArrayList<Double> list = new ArrayList<Double>();

    public static void main(String[] args) {
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(5.0);

        Insert(4);

        System.out.println(GetMedian());
    }

    public static void Insert(Integer num) {
        list.add(Double.valueOf(num));
        Collections.sort(list);
    }

    public static Double GetMedian() {
        int len = list.size();
        int med = len / 2;
        Double result = 0.0;
        if (len%2 != 0) {
            result = list.get(med);
        } else {
            result = (list.get(med-1) + list.get(med)) / 2.0;
        }
        return result;
    }
}
