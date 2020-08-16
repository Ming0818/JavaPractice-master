package sortalgo;

import java.util.Arrays;

public class heapSort {

    /**
     * 堆排序
     * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。
     * 堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：
     * 即子结点的键值或索引总是小于（或者大于）它的父节点。
     * 7.1 算法描述
     * 将初始待排序关键字序列(R1,R2….Rn)构建成大顶堆，此堆为初始的无序区；
     * 将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),
     * 且满足R[1,2…n-1]<=R[n]；
     * 由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，
     * 然后再次将R[1]与无序区最后一个元素交换，得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。
     * 不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成。
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(heap(arr)));

    }

    static int len;

    public static int[] heap(int[] arr){
        len = arr.length;
        if(arr.length<1) return arr;

        buildMax(arr);
        while(len>0){
            swap(arr, 0, len-1);
            len--;
            adjustArr(arr, 0);
        }
        return arr;
    }

    public static void buildMax(int[] arr){
        for(int i=len/2-1; i>=0; i--) adjustArr(arr, i);
    }

    public static void adjustArr(int[] arr, int i){

        int maxIndex = i;
        if(i*2+1<len && arr[i*2+1]>arr[maxIndex]) maxIndex = i*2+1;
        if(i*2+2<len && arr[i*2+2]>arr[maxIndex]) maxIndex = i*2+2;

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

