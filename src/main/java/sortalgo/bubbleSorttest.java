package sortalgo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bubbleSorttest eric_ming96@163.com
 * @Classname bubbleSorttest
 * @Description TODO
 * @Date 2020/8/1 10:51
 * @Created by Eric Yin
 */
public class bubbleSorttest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp =0;
        int[] a= new int[n];
        for (int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0;i<a.length-1;i++)
        {
            for (int j = i+1;j<a.length;j++)
            {
                 if(a[i]>a[j])
                 {
                     temp = a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
            }
        }
        /*String str="";
        for (int i = 0;i<a.length;i++){
            String s=String.valueOf(a[i]);
            str=str+s+" "; }*/
        System.out.print(Arrays.toString(a));}
}
