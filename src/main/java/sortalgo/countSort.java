package sortalgo;

import java.util.Arrays;

public class countSort {

    /**
     * 计数排序
     * 计数排序的核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
     * 作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
     * 计数排序(Counting sort)是一种稳定的排序算法。
     * 计数排序使用一个额外的数组C，其中第i个元素是待排序数组A中值等于i的元素的个数。
     * 然后根据数组C来将A中的元素排到正确的位置。它只能对整数进行排序。
     * 8.1 算法描述
     * 找出待排序的数组中最大和最小的元素；
     * 统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
     * 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
     * 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(count(arr,1,9)));

    }

    public static int[] count(int[] arr, int min, int max){
        if(arr.length<1) return arr;

        int[] coun = new int[max-min+1];
        int[] ans = new int[arr.length];

        for(int i=min; i<=max; i++) coun[i-min] = 0;
        for(int i=0; i<arr.length; i++) coun[arr[i]-min]++;
        for(int i=min+1; i<=arr.length; i++) coun[i-min] += coun[i-min-1];
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int index = coun[num-min]-1; //元素应该在数组中的存放位置
            ans[index] = num;
            coun[num-min]--;
        }
        return ans;
    }
}
