package offercode.Arrarys;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class offer_40 {

    /**
     * 数组中只出现一次的数字
     * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,4,1,3,6,7};
        int[] num1 = new int[1];
        int[] num2 = new int[1];

        FindNumsAppearOnce(arr, num1, num2);
    }

    public static void FindNumsAppearOnce(int[] array, int[] num1, int[] num2) {
        if (array.length < 2) return;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<array.length; i++){
            if (list.contains(array[i])){
                list.remove(new Integer(array[i]));
            } else {
                list.add(array[i]);
            }
        }

        num1[0] = list.get(0);
        num2[0] = list.get(1);

        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

}
