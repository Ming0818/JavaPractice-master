package offercode.Numbers;

import java.util.ArrayList;

public class offer_41 {

    /**
     * 和为s的两个数字
     * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
     * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(FindNumbersWithSum(arr, 8));
    }

    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array.length < 2) return null;

        ArrayList<Integer> result = new ArrayList<Integer>();
        int low=0, high=array.length-1;
        int current = 0;
        while (low < high) {
            current = array[low] + array[high];
            if (current < sum) {
                low++;
            }
            else if (current > sum) {
                high--;
            }
            else {
                result.add(array[low]);
                result.add(array[high]);
                break;
            }
        }
        return result;
    }
}
