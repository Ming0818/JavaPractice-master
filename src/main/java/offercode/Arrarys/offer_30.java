package offercode.Arrarys;

import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.Arrays;

public class offer_30 {

    /**
     * 最小的k个数
     * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，
     * 则最小的4个数字是1,2,3,4,。
     */

    public static void main(String[] args) {

        int[] arr = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(arr, 4));
    }

    static int len;

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input == null || input.length == 0 || k > input.length || k == 0)
            return list;

        len = input.length;
        int index = input.length-1;
        // System.out.println(len);

        buildMin(input);
        // System.out.println(Arrays.toString(input));
        while(k>0){
            swap(input, 0, len-1);
            len--;
            k--;
            adjustArr(input, 0);
            list.add(input[index]);
            index--;
        }

        return list;
    }

    public static void buildMin(int[] arr){
        for(int i=len/2-1; i>=0; i--) adjustArr(arr, i);
    }

    public static void adjustArr(int[] arr, int i){

        int maxIndex = i;
        if(i*2+1<len && arr[i*2+1]<arr[maxIndex]) maxIndex = i*2+1;
        if(i*2+2<len && arr[i*2+2]<arr[maxIndex]) maxIndex = i*2+2;

        if(maxIndex != i){
            swap(arr, maxIndex, i);
            adjustArr(arr, maxIndex);
        }

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
