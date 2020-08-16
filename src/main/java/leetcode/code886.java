package leetcode;

public class code886 {

    public static void main(String[] args) {

        int n1 = 4;
        int[][] d1 = {{1,2},{1,3},{2,4}};

        int n2 = 3;
        int[][] d2 = {{1,2},{1,3},{2,3}};

        int n3 = 5;
        int[][] d3 = {{1,2},{2,3},{3,4},{4,5},{1,5}};

        System.out.println(possibleBipartition(n1,d1));
        System.out.println(possibleBipartition(n2,d2));
        System.out.println(possibleBipartition(n3,d3));

    }

    /**
     给定一组 N 人（编号为 1, 2, ..., N）， 我们想把每个人分进任意大小的两组。
     每个人都可能不喜欢其他人，那么他们不应该属于同一组。
     形式上，如果 dislikes[i] = [a, b]，表示不允许将编号为 a 和 b 的人归入同一组。
     当可以用这种方法将每个人分进两组时，返回 true；否则返回 false。
     */

    static boolean[][] graph;
    static int[] group;

    public static boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new boolean[N][N];
        group = new int[N];
        for (int[] d : dislikes) {
            graph[d[0] - 1][d[1] - 1] = true;
            graph[d[1] - 1][d[0] - 1] = true;
        }
        for (int i = 0; i < N; i ++) {
            if (group[i] == 0 && !dfs(i, 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean dfs(int cur, int color) {
        group[cur] = color;
        for (int i = 0; i < graph.length; i ++) {
            if (graph[cur][i]) {
                if (group[i] == color) {
                    return false;
                }
                if (group[i] == 0 && ! dfs(i, -color)) {
                    return false;
                }
            }
        }
        return true;
    }

}
