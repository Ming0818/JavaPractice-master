package jobcode;
import java.util.Scanner;
public class Main0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][6];
        int[][] model = new int[N][6];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < 6; j++)
            {
            arr[i][j] = sc.nextInt();
            model[0][j] = arr[0][j];
            }
        }
        int a = model[0][0];int b = model[0][1];int c = model[0][2];
        int d = model[0][3];int e = model[0][4];int f = model[0][5];
         int modelq [][] = {{e,f,a,b,c,d},{d,c,a,b,e,f},{e,f,c,d,b,a},{e,f,d,c,a,b},{c,d,a,b,f,e},{e,f,b,a,d,c}};

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                arr[i][j] =
                model[0][j] = arr[0][j];
            }
        }
    }
}