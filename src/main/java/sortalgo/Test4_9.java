package sortalgo;

import  java.util.Scanner;
public class Test4_9 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入总预算:");
        int W=sc.nextInt();
        System.out.println("请输入物资种类总数n:");
        int n=sc.nextInt();      //物品的个数
        System.out.println("请依次输入每个物资价格p1和使用价值p2,用空格分开:");
        int [] w=new int[n+1];     //每个物品的重量
        int [] v=new int[n+1];     //每个物品的价值
        for(int i=1;i<=n;i++) {    //存入键入的数据
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        int [][] c=new int[n+1][W+1];
        //初始化数组 c[i][j]
        for(int i=0;i<=n;i++)
            c[i][0]=0;
        for(int j=0;j<=W;j++)
            c[0][j]=0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=W;j++) {
                if(j<w[i]) {
                    c[i][j]=c[i-1][j];
                }else {
                    c[i][j]=max(c[i-1][j],c[i-1][j-w[i]]+v[i]);
                }
            }
        }
        System.out.println(c[n][W]);

        int [] x=new int[n+1];
        int j=W;
        for(int i=n;i>0;i--) {
            if(c[i][j]>c[i-1][j]) {
                x[i]=1;
                j-=w[i];
            }else {
                x[i]=0;
            }
        }

    }
    private static int max(int i, int j) {
        return i>j? i:j ;
    }
}
