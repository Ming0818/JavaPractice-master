package sortalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bucketSort {

    /**
     * 桶排序
     * 桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。
     * 桶排序 (Bucket sort)的工作的原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，
     * 每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排
     * 9.1 算法描述
     * 人为设置一个BucketSize，作为每个桶所能放置多少个不同数值（例如当BucketSize==5时，
     * 该桶可以存放｛1,2,3,4,5｝这几种数字，但是容量不限，即可以存放100个3）；
     * 遍历输入数据，并且把数据一个一个放到对应的桶里去；
     * 对每个不是空的桶进行排序，可以使用其它排序方法，也可以递归使用桶排序；
     * 从不是空的桶里把排好序的数据拼接起来。
     * @param args
     */

    public static void main(String[] args) {

        int[] arr = {3,4,1,2,5,9,7,6,8};
        System.out.println(Arrays.toString(bucket(arr)));
    }

    public static int[] bucket(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max,arr[i]);
        }

        int buckNum= (max-min)/arr.length+1;
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<ArrayList<Integer>>(buckNum);
        for(int i=0; i<buckNum; i++){
            arrList.add(new ArrayList<Integer>());
        }

        for(int i=0; i<arr.length; i++){
            int num = (arr[i]-min)/arr.length; //根据元素的大小放进桶中
            arrList.get(num).add(arr[i]);
        }

        for(int i=0; i<arrList.size(); i++){
            Collections.sort(arrList.get(i));
        }



        for(int i=0; i<arr.length; i++){
            arr[i] = arrList.get(0).get(i);
        }
        //System.out.println(arrList.get(0));
        return arr;
    }


}
