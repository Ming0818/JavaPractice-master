package offercode.Arrarys;

import java.util.Arrays;

public class offer_14 {

    /**
     * 调整数组顺序使奇数位于偶数前面
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
     * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
     * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */

    public static void main(String[] args) {

        int[] arr = {4,5,3,1,2,7,6,8,9};
        System.out.println(Arrays.toString(reOrderArray(arr)));

    }

    public static int[] reOrderArray(int [] array) {

        if(array.length<=1) return null;
        int i = 0;
        while(i < array.length){
            if(array[i]%2 != 0){
                i++;
            }else{
                int j = i+1;
                while(array[j]%2 == 0){
                    if(j==array.length-1) return array;
                    j++;
                }
                int temp = array[j];
                while(j>i){
                    array[j] = array[j-1];
                    j--;
                }
                array[i] = temp;
            }
        }
        return array;
    }

}
