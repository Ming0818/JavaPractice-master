package sortalgo;

import java.util.Arrays;

public class mergeSort {

    /**
     * 归并排序
     * 和选择排序一样，归并排序的性能不受输入数据的影响，但表现比选择排序好的多，
     * 因为始终都是O(n log n）的时间复杂度。代价是需要额外的内存空间。
     * 归并排序是建立在归并操作上的一种有效的排序算法。
     * 该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。归并排序是一种稳定的排序方法。
     * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。
     * 若将两个有序表合并成一个有序表，称为2-路归并。
     * 5.1 算法描述
     * 把长度为n的输入序列分成两个长度为n/2的子序列；
     * 对这两个子序列分别采用归并排序；
     * 将两个排序好的子序列合并成一个最终的排序序列。
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {5,2,4,5,8,1,2,3};
        System.out.println(Arrays.toString(merge(arr)));

    }

    public static int[] merge(int[] arr){
        if(arr.length<2) return arr;
        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        return mergesort(merge(left),merge(right));
    }

    public static int[] mergesort(int[] left,int[] right){
        int[] ans = new int[left.length+right.length];

        for (int index=0,i=0,j=0; index<ans.length; index++) {
            if (i>=left.length) {
                ans[index] = right[j++];
                //j++;
            } else if (j>=right.length) {
                ans[index] = left[i++];
                //i++;
            } else if (left[i]>right[j]) {
                ans[index] = right[j++];
                //j++;
            } else {
                ans[index] = left[i++];
                //i++;
            }
        }
        return ans;
    }
}
