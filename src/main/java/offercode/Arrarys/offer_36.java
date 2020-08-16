package offercode.Arrarys;

import java.util.Arrays;

public class offer_36 {

    /**
     * 数组中的逆序对
     * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
     * 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
     * 输入描述:
     * 题目保证输入的数组中没有的相同的数字
     * 数据范围：
     * 	对于%50的数据,size<=10^4
     * 	对于%75的数据,size<=10^5
     * 	对于%100的数据,size<=2*10^5
     * 示例1
     * 输入
     * 复制
     * 1,2,3,4,5,6,7,0
     * 输出
     * 复制
     * 7
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(arr));
    }

    private static int count;

    public static int InversePairs(int[] arr) {
        if(arr.length<2) return 0;
        merge(arr, 0, arr.length-1);

        return count % 1000000007;
    }

    public static void merge(int[] arr, int left, int right) {

        if (left >= right){ //只有一个值，不再进行归并
            return;
        }

        int mid = (left + right) / 2 ;
        merge(arr, left, mid); // 左归并
        merge(arr,mid+1, right);  // 右归并
        mergesort(arr, left, right, mid); // 排序统计
    }

    public static void mergesort(int[] arr, int left, int right, int mid) {
        int[] assist = new int[right-left+1];
        int i=0, l1=left, r1=mid+1;
        while (l1<=mid && r1<=right) {
            if (arr[l1] > arr[r1]) {
                assist[i++] = arr[r1++];
                count+=mid-l1+1;
            } else {
                assist[i++] = arr[l1++];
            }
        }
        if (l1 > mid) {
            while (r1 <= right) assist[i++] = arr[r1++];
        }
        if (r1 > right) {
            while (l1 <= mid) assist[i++] = arr[l1++];
        }
        for (int j = 0; j < assist.length; j++) {
            arr[left+j] = assist[j];
        }
    }
}
