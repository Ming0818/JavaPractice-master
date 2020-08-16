package jobcode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int[] Ncalor = new int[N+1];
        int[] Nfavor = new int[N+1];
        int[] Mcalor = new int[N+1];
        int[] Mfavor = new int[N+1];
        Ncalor[0]=0;Nfavor[0]=0;Mcalor[0]=0;Mfavor[0]=0;
        for (int i =1;i<N+1;i++) {
            Ncalor[i] = sc.nextInt();
            Nfavor[i] = sc.nextInt();
        }
        for (int i =0;i<M+1;i++)
        {
            Mcalor[i] = sc.nextInt();
            Mfavor[i] = sc.nextInt();
        }
        boolean canT = false;
        int m = Integer.MAX_VALUE;
        for (int i =1;i<N+1;i++) {
            for (int j =0;j<M+1;j++)
            {
                if (Nfavor[i]+Mfavor[j]>=T)
                {
                    canT = true;
                    m=Math.min(m,Ncalor[i]+Mcalor[j]);
                }
            }
        }
        if (!canT){
            System.out.println(-1);
            return;
        }
        System.out.println(m);


    }
}
